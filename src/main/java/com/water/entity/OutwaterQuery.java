package com.water.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Outwater)实体类
 *
 * @author makejava
 * @since 2021-04-27 21:24:05
 */
@Data
public class OutwaterQuery implements Serializable {
    private static final long serialVersionUID = 841112946003649767L;

    private Integer page;

    private Integer limit;

    private Integer offset;

    private Integer id;
    /**
     * 品牌id
     */
    private Integer bid;
    /**
     * 出库时间
     */
    private Date outtime;
    /**
     * 出库数量
     */
    private Integer outnumber;
    /**
     * 经手员工
     */
    private Integer did;


}
