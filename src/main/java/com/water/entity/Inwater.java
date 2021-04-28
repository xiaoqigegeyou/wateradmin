package com.water.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Inwater)实体类
 *
 * @author makejava
 * @since 2021-04-27 21:24:08
 */
public class Inwater implements Serializable {
    private static final long serialVersionUID = 862758957131453211L;

    private Integer id;
    /**
     * 品牌id
     */
    private Integer bid;
    /**
     * 入库时间
     */
    private Date intime;
    /**
     * 生产日期
     */
    private Date protime;
    /**
     * 入库数量
     */
    private Integer innumber;
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

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Date getProtime() {
        return protime;
    }

    public void setProtime(Date protime) {
        this.protime = protime;
    }

    public Integer getInnumber() {
        return innumber;
    }

    public void setInnumber(Integer innumber) {
        this.innumber = innumber;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

}
