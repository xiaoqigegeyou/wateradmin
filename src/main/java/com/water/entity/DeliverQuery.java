package com.water.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LFZ
 * @date 2021/3/2 - 22:11
 */
@Data
public class DeliverQuery  implements Serializable {

    private static final long serialVersionUID = 266133771645596034L;

    private Integer page;

    private Integer limit;

    private Integer offset;

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
