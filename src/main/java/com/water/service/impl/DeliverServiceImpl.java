package com.water.service.impl;

import com.water.entity.Deliver;
import com.water.dao.DeliverDao;
import com.water.entity.DeliverQuery;
import com.water.service.DeliverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Deliver)表服务实现类
 *
 * @author makejava
 * @since 2021-02-21 16:33:34
 */
@Service("deliverService")
public class DeliverServiceImpl implements DeliverService {
    @Resource
    private DeliverDao deliverDao;

    @Override
    public List<Deliver> query() {
        return deliverDao.query();
    }

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

    @Override
    public List<Deliver> queryAllByLimit(DeliverQuery deliver) {
        return this.deliverDao.queryAllByLimit(deliver);
    }

    @Override
    public List<Deliver> queryAll(DeliverQuery deliver) {
        return this.deliverDao.queryAll(deliver);
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
