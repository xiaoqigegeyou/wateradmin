package com.water.controller;

import com.water.entity.Inandout;
import com.water.entity.InandoutQuery;
import com.water.service.InandoutService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Inandout)表控制层
 *
 * @author makejava
 * @since 2021-04-27 21:24:10
 */
@RestController
@RequestMapping("inandout")
public class InandoutController {
    /**
     * 服务对象
     */
    @Resource
    private InandoutService inandoutService;


    @RequestMapping("addInandout")
    public Map<String, Object> addDeliver(@RequestBody Inandout o) {
        Map<String, Object> result = new HashMap<>();

        System.out.println(o);
        inandoutService.insert(o);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }


    @RequestMapping("selectInandout")
    public Map<String, Object> selectDeliver( @RequestBody InandoutQuery oq){

        oq.setOffset(oq.getPage()*oq.getLimit()-oq.getLimit());
        System.out.println(oq);
        List<Inandout> items = inandoutService.queryAllByLimit(oq);
        HashMap<String, Object> responseData = new HashMap<>();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("items",items);
        List<Inandout> aLlorder = inandoutService.queryAll(oq);
        data.put("total",aLlorder.size());
        responseData.put("code",20000);
        responseData.put("data",data);
        return responseData;
    }
    @RequestMapping("updateInandout")
    public Map<String, Object> updateDeliver(@RequestBody Inandout o) {
        Map<String, Object> result = new HashMap<>();
        System.out.println(o);
        inandoutService.update(o);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }


    /**
     * 获得所有数据
     * @return List<Deliver>
     */
    @RequestMapping("selectAll")
    public Map<String, Object> selectAll() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 20000);
        result.put("data",this.inandoutService.query());
        return result;
    }




    @RequestMapping("deleteInandout")
    public  Map<String, Object> deleteDeliver(@RequestBody Integer id) {
        Map<String, Object> result = new HashMap<>();
        inandoutService.deleteById(id);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }
}
