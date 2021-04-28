package com.water.service;

import com.water.entity.Inwater;
import com.water.entity.InwaterQuery;

import java.util.List;

/**
 * (Inwater)表服务接口
 *
 * @author makejava
 * @since 2021-04-27 21:24:08
 */
public interface InwaterService {
    /**
     * 查询全部数据
     *@return 对象列表
     */
    List<Inwater> query();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Inwater queryById(Integer id);
    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    List<Inwater> queryAllByLimit(InwaterQuery inwaterQuery);


    List<Inwater> queryAll(InwaterQuery inwaterQuery);

    /**
     * 新增数据
     *
     * @param inwater 实例对象
     * @return 实例对象
     */
    Inwater insert(Inwater inwater);

    /**
     * 修改数据
     *
     * @param inwater 实例对象
     * @return 实例对象
     */
    Inwater update(Inwater inwater);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
