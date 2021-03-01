package com.water.controller;

import com.water.entity.Brand;
import com.water.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
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
    /**
     * 获得所有数据
     * @return List<Deliver>
     */
    @RequestMapping("selectAll")
    public Map<String, Object> selectAll() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 20000);
        result.put("data",this.brandService.query());
        return result;
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public Brand selectOne(Integer id) {
        return this.brandService.queryById(id);
    }

}
