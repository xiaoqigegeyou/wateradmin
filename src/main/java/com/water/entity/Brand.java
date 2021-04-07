package com.water.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Brand)实体类
 *
 * @author makejava
 * @since 2021-04-05 16:36:53
 */
@Data
public class Brand implements Serializable {
    private static final long serialVersionUID = -13869580843746974L;

    private Integer id;
    /**
     * 品牌名
     */
    private String name;
    /**
     * 单价
     */
    private Double price;
    /**
     * 对品牌的描述
     */
    private String message;
    /**
     * 头像，暂无图片上传功能，一律使用公网图片地址
     */
    private String image;
    /**
     * 容量
     */
    private String capacity;
    /**
     * 保质期
     */
    private String warranty;
    /**
     * 成分
     */
    private String composition;



}
