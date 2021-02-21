package com.water.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-02-18 23:13:32
 */
public class User implements Serializable {
    private static final long serialVersionUID = -11453287547646619L;

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
     * 角色 1 admin 2 customer
     */
    private Integer roles;
    /**
     * 地址
     */
    private String addr;


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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getRoles() {
        return roles;
    }

    public void setRole(Integer role) {
        this.roles = role;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tell='" + tell + '\'' +
                ", pass='" + pass + '\'' +
                ", role=" + roles +
                ", addr='" + addr + '\'' +
                '}';
    }
}
