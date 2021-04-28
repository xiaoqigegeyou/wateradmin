package com.water.dao;

import com.water.entity.Inandout;
import com.water.entity.InandoutQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Inandout)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-27 21:24:09
 */
public interface InandoutDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Inandout queryById(Integer id);


    /**
     * 查询全部数
     * @return 实例对象
     */
    List<Inandout> query();
    /**
     * 查询指定行数据
     *

     * @return 对象列表
     */
    List<Inandout> queryAllByLimit(InandoutQuery inandoutQuery);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param inandoutQuery 实例对象
     * @return 对象列表
     */
    List<Inandout> queryAll(InandoutQuery inandoutQuery);

    /**
     * 新增数据
     *
     * @param inandout 实例对象
     * @return 影响行数
     */
    int insert(Inandout inandout);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Inandout> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Inandout> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Inandout> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Inandout> entities);

    /**
     * 修改数据
     *
     * @param inandout 实例对象
     * @return 影响行数
     */
    int update(Inandout inandout);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

