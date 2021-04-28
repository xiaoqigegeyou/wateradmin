package com.water.entity;

import java.io.Serializable;

/**
 * (Inandout)实体类
 *
 * @author makejava
 * @since 2021-04-27 21:24:09
 */
public class Inandout implements Serializable {
    private static final long serialVersionUID = -10391251659896820L;

    private Integer id;
    /**
     * 仓库地点
     */
    private String location;
    /**
     * 品牌id
     */
    private Integer bid;
    /**
     * 进货量
     */
    private Integer innumber;
    /**
     * 出货量
     */
    private Integer outnumber;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getInnumber() {
        return innumber;
    }

    public void setInnumber(Integer innumber) {
        this.innumber = innumber;
    }

    public Integer getOutnumber() {
        return outnumber;
    }

    public void setOutnumber(Integer outnumber) {
        this.outnumber = outnumber;
    }

}
