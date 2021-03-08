package com.water.controller;

import com.water.entity.Brand;
import com.water.entity.BrandQuery;

import com.water.service.BrandService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (品牌 Brand)表控制层
 *
 * @author makejava
 * @since 2021-02-21 16:35:26
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    /**
     * 服务对象
     */
    @Resource
    private BrandService brandService;


    @RequestMapping("addBrand")
    public Map<String, Object> addBrand(@RequestBody Brand o) {
        Map<String, Object> result = new HashMap<>();

        System.out.println(o);
        brandService.insert(o);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }


    @RequestMapping("selectBrand")
    public Map<String, Object> selectBrand( @RequestBody BrandQuery oq){

        oq.setOffset(oq.getPage()*oq.getLimit()-oq.getLimit());
        System.out.println(oq);
        List<Brand> items = brandService.queryAllByLimit(oq);
        HashMap<String, Object> responseData = new HashMap<>();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("items",items);
        List<Brand> aLlorder = brandService.queryAll(oq);
        data.put("total",aLlorder.size());
        responseData.put("code",20000);
        responseData.put("data",data);
        return responseData;
    }
    @RequestMapping("updateBrand")
    public Map<String, Object> updateBrand(@RequestBody Brand o) {
        Map<String, Object> result = new HashMap<>();
        System.out.println(o);
        brandService.update(o);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }


    @RequestMapping("selectAll")
    public Map<String, Object> selectAll() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 20000);
        result.put("data",this.brandService.query());
        return result;
    }

    @RequestMapping("deleteBrand")
    public  Map<String, Object> deleteBrand(@RequestBody Integer id) {
        Map<String, Object> result = new HashMap<>();
        System.out.println(id);
        brandService.deleteById(id);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }
}
