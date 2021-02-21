package com.water.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2021-02-18 23:13:28
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 269600122773439794L;

    private Integer id;

    private String name;

    private String tell;
    /**
     * 水品牌名
     */
    private String bname;
    /**
     * 总价
     */
    private Double price;
    /**
     * 送水人
     */
    private String preson;
    /**
     * 订单开始时间
     */
    private Date starttime;
    /**
     * 订单结束时间
     */
    private Date endtime;

    private String addr;
    /**
     * 订单评价分
     */
    private Double rate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPreson() {
        return preson;
    }

    public void setPreson(String preson) {
        this.preson = preson;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

}
