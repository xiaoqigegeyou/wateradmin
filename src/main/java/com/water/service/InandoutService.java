package com.water.service;

import com.water.entity.Inandout;
import com.water.entity.InandoutQuery;

import java.util.List;

/**
 * (Inandout)表服务接口
 *
 * @author makejava
 * @since 2021-04-27 21:24:10
 */
public interface InandoutService {
    /**
     * 查询全部数据
     *@return 对象列表
     */
    List<Inandout> query();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Inandout queryById(Integer id);

    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    List<Inandout> queryAllByLimit(InandoutQuery inandoutQuery);


    List<Inandout> queryAll(InandoutQuery inandoutQuery);
    /**
     * 新增数据
     *
     * @param inandout 实例对象
     * @return 实例对象
     */
    Inandout insert(Inandout inandout);

    /**
     * 修改数据
     *
     * @param inandout 实例对象
     * @return 实例对象
     */
    Inandout update(Inandout inandout);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
