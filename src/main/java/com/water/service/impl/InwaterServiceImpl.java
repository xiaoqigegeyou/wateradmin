package com.water.service.impl;

import com.water.entity.Inwater;
import com.water.dao.InwaterDao;
import com.water.entity.InwaterQuery;
import com.water.service.InwaterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Inwater)表服务实现类
 *
 * @author makejava
 * @since 2021-04-27 21:24:08
 */
@Service("inwaterService")
public class InwaterServiceImpl implements InwaterService {
    @Resource
    private InwaterDao inwaterDao;

    @Override
    public List<Inwater> query() {
        return inwaterDao.query();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Inwater queryById(Integer id) {
        return this.inwaterDao.queryById(id);
    }

    @Override
    public List<Inwater> queryAllByLimit(InwaterQuery inwaterQuery) {
        return inwaterDao.queryAllByLimit(inwaterQuery);
    }

    @Override
    public List<Inwater> queryAll(InwaterQuery inwaterQuery) {
        return inwaterDao.queryAll(inwaterQuery);
    }




    /**
     * 新增数据
     *
     * @param inwater 实例对象
     * @return 实例对象
     */
    @Override
    public Inwater insert(Inwater inwater) {
        this.inwaterDao.insert(inwater);
        inwaterDao.updateInNumber(inwater.getBid());
        return inwater;
    }

    /**
     * 修改数据
     *
     * @param inwater 实例对象
     * @return 实例对象
     */
    @Override
    public Inwater update(Inwater inwater) {
        this.inwaterDao.update(inwater);
        inwaterDao.updateInNumber(inwater.getBid());
        return this.queryById(inwater.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        Inwater in=inwaterDao.queryById(id);
        int a=this.inwaterDao.deleteById(id);
        inwaterDao.updateInNumber(in.getBid());
        return a > 0;
    }
}
