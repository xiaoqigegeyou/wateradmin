package com.water.controller;

import com.water.entity.Order;
import com.water.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2021-02-18 23:13:29
 */
@RestController
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public Order selectOne(Integer id) {
        return this.orderService.queryById(id);
    }

}
