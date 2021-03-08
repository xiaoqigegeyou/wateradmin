package com.water.service.impl;

import com.water.entity.Brand;
import com.water.dao.BrandDao;
import com.water.entity.BrandQuery;
import com.water.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Brand)表服务实现类
 *
 * @author makejava
 * @since 2021-02-21 16:33:32
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;

    @Override
    public List<Brand> query() {
        return brandDao.query();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Brand queryById(Integer id) {
        return this.brandDao.queryById(id);
    }

    @Override
    public List<Brand> queryAllByLimit(BrandQuery brand) {
        return this.brandDao.queryAllByLimit(brand);
    }

    @Override
    public List<Brand> queryAll(BrandQuery brand) {
        return this.brandDao.queryAll(brand);
    }

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand insert(Brand brand) {
        this.brandDao.insert(brand);
        return brand;
    }

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand update(Brand brand) {
        this.brandDao.update(brand);
        return this.queryById(brand.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.brandDao.deleteById(id) > 0;
    }
}
