package com.water.controller;

import com.water.entity.Deliver;
import com.water.entity.Order;
import com.water.entity.OrderQuery;
import com.water.service.DeliverService;
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
    @Resource
    private DeliverService deliverService;
    /**
     *
     * @param o
     * @return
     * @throws Exception
     */
    @RequestMapping("insert")
    public Map<String, Object> insert(@RequestBody Order o) throws Exception {
        Map<String, Object> result = new HashMap<>();
       Deliver d= deliverService.queryById(o.getDid());
       o.setPerson(d.getName());
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

        if(o.getFlag()==1){
            n.setFlag(2);
            n.setEndtime(o.getEndtime());
            orderService.update(n);
        }else if(o.getFlag()==2){
            n.setFlag(3);
            n.setRate(o.getRate());
            n.setText(o.getText());
            orderService.update(n);
            orderService.updateDeliverRate(n.getId());
        }
        System.out.println(n);

        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }


    @RequestMapping("deleteorder")
    public  Map<String, Object> deleteorder(@RequestBody Integer id) {
        Map<String, Object> result = new HashMap<>();
        orderService.deleteById(id);
        result.put("code", 20000);
        result.put("data", "success");
        return result;
    }
}
