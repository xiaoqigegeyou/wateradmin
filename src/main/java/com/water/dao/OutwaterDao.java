package com.water.dao;

import com.water.entity.Outwater;
import com.water.entity.OutwaterQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Outwater)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-27 21:24:06
 */
public interface OutwaterDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Outwater queryById(Integer id);
    /**
     * 查询全部数
     * @return 实例对象
     */
    List<Outwater> query();

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */

    List<Outwater> queryAllByLimit(OutwaterQuery outwaterQuery);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param outwaterQuery 实例对象
     * @return 对象列表
     */
    List<Outwater> queryAll(OutwaterQuery outwaterQuery);

    /**
     * 新增数据
     *
     * @param outwater 实例对象
     * @return 影响行数
     */
    int insert(Outwater outwater);

    int updateOutNumber(@Param("bid") Integer bid);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Outwater> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Outwater> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Outwater> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Outwater> entities);

    /**
     * 修改数据
     *
     * @param outwater 实例对象
     * @return 影响行数
     */
    int update(Outwater outwater);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

