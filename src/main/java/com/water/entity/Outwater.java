package com.water.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Outwater)实体类
 *
 * @author makejava
 * @since 2021-04-27 21:24:05
 */
public class Outwater implements Serializable {
    private static final long serialVersionUID = 841112946003649767L;

    private Integer id;
    /**
     * 品牌id
     */
    private Integer bid;
    /**
     * 出库时间
     */
    private Date outtime;
    /**
     * 出库数量
     */
    private Integer outnumber;
    /**
     * 经手员工
     */
    private Integer did;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Integer getOutnumber() {
        return outnumber;
    }

    public void setOutnumber(Integer outnumber) {
        this.outnumber = outnumber;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

}
