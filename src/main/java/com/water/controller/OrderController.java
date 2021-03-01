package com.water.controller;

import com.water.entity.Order;
import com.water.entity.OrderQuery;
import com.water.service.OrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2021-02-21 16:35:27
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
     *
     * @param o
     * @return
     * @throws Exception
     */
    @RequestMapping("insert")
    public Map<String, Object> insert(@RequestBody Order o) throws Exception {
        Map<String, Object> result = new HashMap<>();
        System.out.println(o);
       orderService.insert(o);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }


    @RequestMapping("selectorder")
    public Map selectorder( @RequestBody OrderQuery oq){

        oq.setOffset(oq.getPage()*oq.getLimit()-oq.getLimit());
        System.out.println(oq);
        List<Order> items = orderService.queryAllByLimit(oq);
        HashMap<String, Object> responseData = new HashMap<>();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("items",items);
        List<Order> aLlorder = orderService.queryAll(oq);
        data.put("total",aLlorder.size());
        responseData.put("code",20000);
        responseData.put("data",data);
        return responseData;
    }
    @RequestMapping("updateorder")
    public Map<String, Object> updateorder(@RequestBody Order o) {
        Map<String, Object> result = new HashMap<>();
        Order n=new Order();
        n.setId(o.getId());
        n.setFlag(o.getFlag()+1);
        n.setEndtime(o.getEndtime());
        n.setRate(o.getRate());
        n.setText(o.getText());
        System.out.println(n);
        orderService.update(n);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }

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
