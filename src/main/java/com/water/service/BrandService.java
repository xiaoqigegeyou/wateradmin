package com.water.service;

import com.water.entity.Brand;
import com.water.entity.BrandQuery;

import java.util.List;

/**
 * (Brand)表服务接口
 *
 * @author makejava
 * @since 2021-02-21 16:33:32
 */
public interface BrandService {
    /**
     * 查询全部数据
     *@return 对象列表
     */
    List<Brand> query();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Brand queryById(Integer id);

    /**
     * 查询多条数据
     * @param brand
     * @return
     */
    List<Brand> queryAllByLimit(BrandQuery brand);


    List<Brand> queryAll(BrandQuery brand);

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand insert(Brand brand);

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand update(Brand brand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
