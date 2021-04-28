package com.water.controller;

import com.water.entity.Inwater;
import com.water.entity.InwaterQuery;
import com.water.service.InwaterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Inwater)表控制层
 *
 * @author makejava
 * @since 2021-04-27 21:24:08
 */
@RestController
@RequestMapping("inwater")
public class InwaterController {
    /**
     * 服务对象
     */
    @Resource
    private InwaterService inwaterService;


    @RequestMapping("addInwater")
    public Map<String, Object> addDeliver(@RequestBody Inwater o) {
        Map<String, Object> result = new HashMap<>();

        System.out.println(o);
        inwaterService.insert(o);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }


    @RequestMapping("selectInwater")
    public Map<String, Object> selectDeliver( @RequestBody InwaterQuery oq){

        oq.setOffset(oq.getPage()*oq.getLimit()-oq.getLimit());
        System.out.println(oq);
        List<Inwater> items = inwaterService.queryAllByLimit(oq);
        HashMap<String, Object> responseData = new HashMap<>();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("items",items);
        List<Inwater> aLlorder = inwaterService.queryAll(oq);
        data.put("total",aLlorder.size());
        responseData.put("code",20000);
        responseData.put("data",data);
        return responseData;
    }
    @RequestMapping("updateInwater")
    public Map<String, Object> updateDeliver(@RequestBody Inwater o) {
        Map<String, Object> result = new HashMap<>();
        System.out.println(o);
        inwaterService.update(o);
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
        result.put("data",this.inwaterService.query());
        return result;
    }




    @RequestMapping("deleteInwater")
    public  Map<String, Object> deleteDeliver(@RequestBody Integer id) {
        Map<String, Object> result = new HashMap<>();
        inwaterService.deleteById(id);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }

}
