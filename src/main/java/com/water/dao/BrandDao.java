package com.water.dao;

import com.water.entity.Brand;
import com.water.entity.BrandQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Brand)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-21 16:33:32
 */
public interface BrandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Brand queryById(Integer id);
    /**
     * 查询全部数
     * @return 实例对象
     */
    List<Brand> query();
    /**
     * 查询指定行数据
     *
     *
     * @return 对象列表
     */
    List<Brand> queryAllByLimit(BrandQuery brand);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param brand 实例对象
     * @return 对象列表
     */
    List<Brand> queryAll( BrandQuery brand );

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 影响行数
     */
    int insert(Brand brand);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Brand> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Brand> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Brand> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Brand> entities);

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 影响行数
     */
    int update(Brand brand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

