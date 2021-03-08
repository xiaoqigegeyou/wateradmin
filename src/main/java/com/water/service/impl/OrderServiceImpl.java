package com.water.service.impl;

import com.water.entity.Order;
import com.water.dao.OrderDao;
import com.water.entity.OrderQuery;
import com.water.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2021-02-21 16:33:35
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    @Override
    public List<Order> query() {
        return orderDao.query();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Order queryById(Integer id) {
        return this.orderDao.queryById(id);
    }

    @Override
    public List<Order> queryAllByLimit(OrderQuery order) {
        return orderDao.queryAllByLimit(order);
    }

    @Override
    public List<Order> queryAll(OrderQuery order) {
        return this.orderDao.queryAll(order);
    }

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order insert(Order order ) {
        this.orderDao.insert(order);
        return order;
    }

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order update(Order order) {
        this.orderDao.update(order);
        return this.queryById(order.getId());
    }
    @Override
    public boolean updateDeliverRate(Integer id) {
        return this.orderDao.updateDeliverRate(id)>0;

    }
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.orderDao.deleteById(id) > 0;
    }
}
