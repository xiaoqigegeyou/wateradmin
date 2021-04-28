package com.water.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Inandout)实体类
 *
 * @author makejava
 * @since 2021-04-27 21:24:09
 */
@Data
public class InandoutQuery implements Serializable {
    private static final long serialVersionUID = -10391251659896820L;


    private Integer page;

    private Integer limit;

    private Integer offset;

    private Integer id;
    /**
     * 仓库地点
     */
    private String location;
    /**
     * 品牌id
     */
    private Integer bid;
    /**
     * 进货量
     */
    private Integer innumber;
    /**
     * 出货量
     */
    private Integer outnumber;


}
