package com.water.service.impl;

import com.water.entity.Deliver;
import com.water.dao.DeliverDao;
import com.water.service.DeliverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Deliver)表服务实现类
 *
 * @author makejava
 * @since 2021-02-18 23:13:32
 */
@Service("deliverService")
public class DeliverServiceImpl implements DeliverService {
    @Resource
    private DeliverDao deliverDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Deliver queryById(Integer id) {
        return this.deliverDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Deliver> queryAllByLimit(int offset, int limit) {
        return this.deliverDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param deliver 实例对象
     * @return 实例对象
     */
    @Override
    public Deliver insert(Deliver deliver) {
        this.deliverDao.insert(deliver);
        return deliver;
    }

    /**
     * 修改数据
     *
     * @param deliver 实例对象
     * @return 实例对象
     */
    @Override
    public Deliver update(Deliver deliver) {
        this.deliverDao.update(deliver);
        return this.queryById(deliver.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.deliverDao.deleteById(id) > 0;
    }
}
