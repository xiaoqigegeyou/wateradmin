package com.water.service;

import com.water.entity.Order;

import java.util.List;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2021-02-18 23:20:19
 */
public interface OrderService {
    Order queryById(Integer id);
    List<Order> queryAllByLimit(int offset, int limit);
    Order insert(Order order);
    Order update(Order order);
    boolean deleteById(Integer id);
}
