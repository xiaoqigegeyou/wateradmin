package com.water.dao;

import com.water.entity.Inwater;
import com.water.entity.InwaterQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Inwater)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-27 21:24:08
 */
public interface InwaterDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Inwater queryById(Integer id);
    /**
     * 查询全部数
     * @return 实例对象
     */
    List<Inwater> query();

    /**
     * 查询指定行数据
     * @return 对象列表
     */
    List<Inwater> queryAllByLimit(InwaterQuery inwaterQuery);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param inwaterQuery 实例对象
     * @return 对象列表
     */
    List<Inwater> queryAll(InwaterQuery inwaterQuery);

    /**
     * 新增数据
     *
     * @param inwater 实例对象
     * @return 影响行数
     */
    int insert(Inwater inwater);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Inwater> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Inwater> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Inwater> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Inwater> entities);

    /**
     * 修改数据
     *
     * @param inwater 实例对象
     * @return 影响行数
     */
    int update(Inwater inwater);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    int updateInNumber(@Param("bid") Integer bid);
}

