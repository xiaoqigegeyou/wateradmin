package com.water.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2021-02-21 16:33:34
 */
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 266133771645596038L;

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
