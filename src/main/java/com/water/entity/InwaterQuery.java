package com.water.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Inwater)实体类
 *
 * @author makejava
 * @since 2021-04-27 21:24:08
 */
@Data
public class InwaterQuery implements Serializable {
    private static final long serialVersionUID = 862758957131453211L;
    private Integer page;

    private Integer limit;

    private Integer offset;

    private Integer id;
    /**
     * 品牌id
     */
    private Integer bid;
    /**
     * 入库时间
     */
    private Date intime;
    /**
     * 生产日期
     */
    private Date protime;
    /**
     * 入库数量
     */
    private Integer innumber;
    /**
     * 经手员工
     */
    private Integer did;




}
