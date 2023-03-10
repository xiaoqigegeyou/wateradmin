package com.water.dao;

import com.water.entity.Deliver;
import com.water.entity.DeliverQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Deliver)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-21 16:33:34
 */
public interface DeliverDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Deliver queryById(Integer id);
    /**
     * 查询全部数
     * @return 实例对象
     */
    List<Deliver> query();
    /**
     * 查询指定行数据
     *
     *
     * @return 对象列表
     */
    List<Deliver> queryAllByLimit(DeliverQuery deliver);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param deliver 实例对象
     * @return 对象列表
     */
    List<Deliver> queryAll( DeliverQuery deliver );

    /**
     * 新增数据
     *
     * @param deliver 实例对象
     * @return 影响行数
     */
    int insert(Deliver deliver);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Deliver> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Deliver> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Deliver> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Deliver> entities);

    /**
     * 修改数据
     *
     * @param deliver 实例对象
     * @return 影响行数
     */
    int update(Deliver deliver);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

