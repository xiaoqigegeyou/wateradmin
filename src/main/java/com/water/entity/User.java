package com.water.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-02-21 17:10:20
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 532034972170467972L;

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
     * 密码
     */
    private String pass;
    /**
     * 角色 1 admin 2 normal
     */
    private Integer roles;
    /**
     * 区域
     */
    private String area;
    /**
     * 地址
     */
    private String addr;
    /**
     * 性别
     */
    private String  sex;
    /**
     * 头像，暂无图片上传功能，一律使用公网图片地址
     */
    private String avatar;



}
