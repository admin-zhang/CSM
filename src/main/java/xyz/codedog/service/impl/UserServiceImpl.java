package xyz.codedog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.codedog.dao.UserDao;
import xyz.codedog.po.User;
import xyz.codedog.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author panda
 * @Date 2020/5/14
 * @Version 1.0
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findUser(String usercode, String password) {
        User user = this.userDao.findUser(usercode, password);
        return user;
    }
}
