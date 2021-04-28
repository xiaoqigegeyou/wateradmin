package com.water.service;

import com.water.entity.Outwater;
import com.water.entity.OutwaterQuery;

import java.util.List;

/**
 * (Outwater)表服务接口
 *
 * @author makejava
 * @since 2021-04-27 21:24:06
 */
public interface OutwaterService {
    List<Outwater> query();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Outwater queryById(Integer id);
    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    List<Outwater> queryAllByLimit(OutwaterQuery outwaterQuery);


    List<Outwater> queryAll(OutwaterQuery outwaterQuery);

    /**
     * 新增数据
     *
     * @param outwater 实例对象
     * @return 实例对象
     */
    Outwater insert(Outwater outwater);

    /**
     * 修改数据
     *
     * @param outwater 实例对象
     * @return 实例对象
     */
    Outwater update(Outwater outwater);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
