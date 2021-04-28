package com.water.service.impl;

import com.water.entity.Outwater;
import com.water.dao.OutwaterDao;
import com.water.entity.OutwaterQuery;
import com.water.service.OutwaterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Outwater)表服务实现类
 *
 * @author makejava
 * @since 2021-04-27 21:24:06
 */
@Service("outwaterService")
public class OutwaterServiceImpl implements OutwaterService {
    @Resource
    private OutwaterDao outwaterDao;

    @Override
    public List<Outwater> query() {
        return outwaterDao.query();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Outwater queryById(Integer id) {
        return this.outwaterDao.queryById(id);
    }

    @Override
    public List<Outwater> queryAllByLimit(OutwaterQuery outwaterQuery) {
        return outwaterDao.queryAllByLimit(outwaterQuery);
    }

    @Override
    public List<Outwater> queryAll(OutwaterQuery outwaterQuery) {
        return outwaterDao.queryAll(outwaterQuery);
    }



    /**
     * 新增数据
     *
     * @param outwater 实例对象
     * @return 实例对象
     */
    @Override
    public Outwater insert(Outwater outwater) {
        this.outwaterDao.insert(outwater);
        return outwater;
    }

    /**
     * 修改数据
     *
     * @param outwater 实例对象
     * @return 实例对象
     */
    @Override
    public Outwater update(Outwater outwater) {
        this.outwaterDao.update(outwater);
        return this.queryById(outwater.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.outwaterDao.deleteById(id) > 0;
    }
}
