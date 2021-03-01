package com.water.controller;

import com.water.entity.Deliver;
import com.water.service.DeliverService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * (送水工 Deliver)表控制层
 *
 * @author makejava
 * @since 2021-02-21 16:35:26
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
     * 获得所有数据
     * @return List<Deliver>
     */
    @RequestMapping("selectAll")
    public Map<String, Object> selectAll() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 20000);
        result.put("data",this.deliverService.query());
        return result;
    }



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
