package com.water.service;

import com.water.entity.Brand;

import java.util.List;

/**
 * (Brand)表服务接口
 *
 * @author makejava
 * @since 2021-02-18 23:20:19
 */
public interface BrandService  {
    Brand queryById(Integer id);
    List<Brand> queryAllByLimit(int offset, int limit);
    Brand insert(Brand brand);
    Brand update(Brand brand);
    boolean deleteById(Integer id);

}
