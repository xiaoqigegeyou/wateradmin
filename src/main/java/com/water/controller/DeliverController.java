package com.water.controller;

import com.water.entity.Deliver;
import com.water.service.DeliverService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Deliver)表控制层
 *
 * @author makejava
 * @since 2021-02-18 23:13:32
 */
@RestController
@RequestMapping("deliver")
public class DeliverController {
    /**
     * 服务对象
     */
    @Resource
    private DeliverService deliverService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public Deliver selectOne(Integer id) {
        return this.deliverService.queryById(id);
    }

}
