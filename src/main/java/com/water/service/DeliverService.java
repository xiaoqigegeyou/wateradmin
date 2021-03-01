package com.water.service;

import com.water.entity.Deliver;

import java.util.List;

/**
 * (Deliver)表服务接口
 *
 * @author makejava
 * @since 2021-02-21 16:33:34
 */
public interface DeliverService {
    /**
     * 查询全部数据
     *@return 对象列表
     */
    List<Deliver> query();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Deliver queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Deliver> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param deliver 实例对象
     * @return 实例对象
     */
    Deliver insert(Deliver deliver);

    /**
     * 修改数据
     *
     * @param deliver 实例对象
     * @return 实例对象
     */
    Deliver update(Deliver deliver);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
