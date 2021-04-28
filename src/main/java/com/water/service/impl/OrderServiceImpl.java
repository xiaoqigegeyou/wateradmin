package com.water.service.impl;

import com.water.dao.BrandDao;
import com.water.dao.OrderDao;
import com.water.dao.OutwaterDao;
import com.water.entity.*;
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
    @Resource
    private OutwaterDao outwaterDao;
    @Resource
    private BrandDao brandDao;

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
        Outwater out =new Outwater();
        BrandQuery b=new BrandQuery();
        b.setName(order.getBname());
        List<Brand> c=brandDao.queryAll(b);

        out.setBid(c.get(0).getId());
        out.setOuttime(order.getStarttime());
        out.setOutnumber(order.getNumber());
        out.setDid(order.getDid());
        outwaterDao.insert(out);
        outwaterDao.updateOutNumber(out.getBid());
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
