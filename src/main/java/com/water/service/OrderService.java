package com.water.service;

import com.water.entity.Order;
import com.water.entity.OrderQuery;

import java.util.List;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2021-02-21 16:33:35
 */
public interface OrderService {
    /**
     * 查询全部数据
     *@return 对象列表
     */
    List<Order> query();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Order queryById(Integer id);

    /**
     * 查询多条数据
     * @param order
     * @return
     */
    List<Order> queryAllByLimit(OrderQuery order);


    List<Order> queryAll(OrderQuery order);


    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    Order insert(Order order);

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    Order update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
