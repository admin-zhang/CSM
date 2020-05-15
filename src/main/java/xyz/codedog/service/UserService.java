package xyz.codedog.service;

import xyz.codedog.po.User;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author panda
 * @Date 2020/5/14
 * @Version 1.0
 **/

public interface UserService {
    public User findUser(String usercode, String password);
}
