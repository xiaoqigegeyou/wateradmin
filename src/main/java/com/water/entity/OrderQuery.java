package com.water.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 分页请求
 * @author LFZ
 * @date 2021/2/26 - 21:58
 */
@Data
public class OrderQuery  implements Serializable {
    private static final long serialVersionUID = 266133771645596032L;

    private Integer page;

    private Integer limit;

    private Integer offset;

    private Integer id;

    private String name;

    private String tell;
    /**
     * 品牌名
     */
    private String bname;
    /**
     * 总价
     */
    private Double price;
    /**
     * 送水人
     */
    private String person;
    /**
     * 订单开始时间
     */
    private Date starttime;
    /**
     * 预约时间
     */
    private Date appointmenttime;
    /**
     * 订单结束时间
     */
    private Date endtime;

    private String addr;
    /**
     * 订单评价分
     */
    private Double rate;
    /**
     * 订单状态标识 1 配送中 2 已送达 3 已评价
     */
    private Integer flag;
    /**
     *  评价备注
     */
    private String text;

    private Integer uid;

    private Integer did;

}
