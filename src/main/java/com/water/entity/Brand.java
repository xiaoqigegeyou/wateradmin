package com.water.entity;

import java.io.Serializable;

/**
 * (Brand)实体类
 *
 * @author makejava
 * @since 2021-02-18 23:13:30
 */
public class Brand implements Serializable {
    private static final long serialVersionUID = -88550423086191677L;

    private Integer id;
    /**
     * 品牌名
     */
    private String name;
    /**
     * 单价
     */
    private Double price;


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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
