package com.water.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LFZ
 * @date 2021/3/2 - 22:11
 */
@Data
public class BrandQuery  implements Serializable {

    private static final long serialVersionUID = 266133771645596038L;

    private Integer page;

    private Integer limit;

    private Integer offset;

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
