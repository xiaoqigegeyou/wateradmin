package com.water.controller;

import com.water.entity.Brand;
import com.water.service.BrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Brand)表控制层
 *
 * @author makejava
 * @since 2021-02-18 23:13:31
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
