package com.water.service.impl;

import com.water.entity.User;
import com.water.dao.UserDao;
import com.water.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2021-02-21 16:33:36
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    /**
     * 判断用户是否存在，存在则返回true，不存在则返回false
     * @param tell 电话
     * @param pass 用户密码
     * @return true,false
     */
    @Override
    public boolean isUserExist(String tell, String pass) {
        List<User> userList = userDao.query();
        for (User user: userList) {
            System.out.println(user);
        }

        boolean isExist = false;

        for (User user: userList) {
            if (user.getTell().equals(tell) && user.getPass().equals(pass)) {
                isExist = true;
                System.out.println(isExist);
            }
        }
        return isExist;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 根据条件查询多条数据
     *
     * @param u
     * @return 对象列表
     */
    @Override
    public List<User> queryAll(User u) {
        return this.userDao.queryAll(u);
    }
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userDao.deleteById(id) > 0;
    }
}
