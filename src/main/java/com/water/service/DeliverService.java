package com.water.service;

import com.water.entity.Deliver;

import java.util.List;

/**
 * (Deliver)表服务接口
 *
 * @author makejava
 * @since 2021-02-18 23:20:19
 */
public interface DeliverService{
    Deliver queryById(Integer id);
    List<Deliver> queryAllByLimit(int offset, int limit);
    Deliver insert(Deliver deliver);
    Deliver update(Deliver deliver);
    boolean deleteById(Integer id);
}
