package com.water.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Brand)实体类
 *
 * @author makejava
 * @since 2021-02-21 16:33:32
 */
@Data
public class Brand implements Serializable {

    private static final long serialVersionUID = -21281986084170145L;

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



}
