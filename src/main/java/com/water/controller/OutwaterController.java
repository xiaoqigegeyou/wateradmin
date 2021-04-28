package com.water.controller;

import com.water.entity.Outwater;
import com.water.entity.OutwaterQuery;
import com.water.service.OutwaterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Outwater)表控制层
 *
 * @author makejava
 * @since 2021-04-27 21:24:07
 */
@RestController
@RequestMapping("outwater")
public class OutwaterController {
    /**
     * 服务对象
     */
    @Resource
    private OutwaterService outwaterService;


    @RequestMapping("addOutwater")
    public Map<String, Object> addDeliver(@RequestBody Outwater o) {
        Map<String, Object> result = new HashMap<>();

        System.out.println(o);
        outwaterService.insert(o);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }


    @RequestMapping("selectOutwater")
    public Map<String, Object> selectDeliver( @RequestBody OutwaterQuery oq){

        oq.setOffset(oq.getPage()*oq.getLimit()-oq.getLimit());
        System.out.println(oq);
        List<Outwater> items = outwaterService.queryAllByLimit(oq);
        HashMap<String, Object> responseData = new HashMap<>();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("items",items);
        List<Outwater> aLlorder = outwaterService.queryAll(oq);
        data.put("total",aLlorder.size());
        responseData.put("code",20000);
        responseData.put("data",data);
        return responseData;
    }
    @RequestMapping("updateOutwater")
    public Map<String, Object> updateDeliver(@RequestBody Outwater o) {
        Map<String, Object> result = new HashMap<>();
        System.out.println(o);
        outwaterService.update(o);
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
        result.put("data",this.outwaterService.query());
        return result;
    }




    @RequestMapping("deleteOutwater")
    public  Map<String, Object> deleteDeliver(@RequestBody Integer id) {
        Map<String, Object> result = new HashMap<>();
        outwaterService.deleteById(id);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }

}
