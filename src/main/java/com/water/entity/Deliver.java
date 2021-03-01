package com.water.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Deliver)实体类
 *
 * @author makejava
 * @since 2021-02-21 16:33:33
 */
@Data
public class Deliver implements Serializable {
    private static final long serialVersionUID = 273502702693075866L;

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
     * 性别
     */
    private String sex;
    /**
     * 平均分
     */
    private Double rate;


}
