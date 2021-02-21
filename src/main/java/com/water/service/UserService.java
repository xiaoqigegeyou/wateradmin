package com.water.service;

import com.water.entity.User;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2021-02-18 23:20:19
 */
public interface UserService {
    User queryById(Integer id);
    List<User> queryAllByLimit(int offset, int limit);
    User insert(User user);
    User update(User user);
    boolean deleteById(Integer id);
    boolean isUserExist(String tell, String password);
    List<User> queryAll(User u);
}
