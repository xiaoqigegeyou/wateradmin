package com.water.service.impl;

import com.water.entity.Inandout;
import com.water.dao.InandoutDao;
import com.water.entity.InandoutQuery;
import com.water.service.InandoutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Inandout)表服务实现类
 *
 * @author makejava
 * @since 2021-04-27 21:24:10
 */
@Service("inandoutService")
public class InandoutServiceImpl implements InandoutService {
    @Resource
    private InandoutDao inandoutDao;

    @Override
    public List<Inandout> query() {
        return inandoutDao.query();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Inandout queryById(Integer id) {
        return this.inandoutDao.queryById(id);
    }

    @Override
    public List<Inandout> queryAllByLimit(InandoutQuery inandoutQuery) {
        return inandoutDao.queryAllByLimit(inandoutQuery);
    }

    @Override
    public List<Inandout> queryAll(InandoutQuery inandoutQuery) {
        return inandoutDao.queryAll(inandoutQuery);
    }


    /**
     * 新增数据
     *
     * @param inandout 实例对象
     * @return 实例对象
     */
    @Override
    public Inandout insert(Inandout inandout) {
        this.inandoutDao.insert(inandout);
        return inandout;
    }

    /**
     * 修改数据
     *
     * @param inandout 实例对象
     * @return 实例对象
     */
    @Override
    public Inandout update(Inandout inandout) {
        this.inandoutDao.update(inandout);
        return this.queryById(inandout.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.inandoutDao.deleteById(id) > 0;
    }
}
