package com.water.entity;

import java.io.Serializable;

/**
 * (Deliver)实体类
 *
 * @author makejava
 * @since 2021-02-18 23:13:31
 */
public class Deliver implements Serializable {
    private static final long serialVersionUID = -73037677110841215L;

    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 电话
     */
    private String tell;
    /**
     * 平均分
     */
    private Object rate;


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

    public Object getRate() {
        return rate;
    }

    public void setRate(Object rate) {
        this.rate = rate;
    }

}
