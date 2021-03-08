package com.water.controller;

import com.water.entity.*;
import com.water.service.DeliverService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (送水工 Deliver)表控制层
 *
 * @author makejava
 * @since 2021-02-21 16:35:26
 */
@RestController
@RequestMapping("deliver")
public class DeliverController {
    /**
     * 服务对象
     */
    @Resource
    private DeliverService deliverService;

    @RequestMapping("addDeliver")
    public Map<String, Object> addDeliver(@RequestBody Deliver o) {
        Map<String, Object> result = new HashMap<>();

        System.out.println(o);
        deliverService.insert(o);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }


    @RequestMapping("selectDeliver")
    public Map<String, Object> selectDeliver( @RequestBody DeliverQuery oq){

        oq.setOffset(oq.getPage()*oq.getLimit()-oq.getLimit());
        System.out.println(oq);
        List<Deliver> items = deliverService.queryAllByLimit(oq);
        HashMap<String, Object> responseData = new HashMap<>();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("items",items);
        List<Deliver> aLlorder = deliverService.queryAll(oq);
        data.put("total",aLlorder.size());
        responseData.put("code",20000);
        responseData.put("data",data);
        return responseData;
    }
    @RequestMapping("updateDeliver")
    public Map<String, Object> updateDeliver(@RequestBody Deliver o) {
        Map<String, Object> result = new HashMap<>();
        System.out.println(o);
        deliverService.update(o);
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
        result.put("data",this.deliverService.query());
        return result;
    }




    @RequestMapping("deleteDeliver")
    public  Map<String, Object> deleteDeliver(@RequestBody Integer id) {
        Map<String, Object> result = new HashMap<>();
        deliverService.deleteById(id);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }

}
