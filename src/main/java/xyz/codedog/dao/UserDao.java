package xyz.codedog.dao;

import org.apache.ibatis.annotations.Param;
import xyz.codedog.po.User;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author panda
 * @Date 2020/5/14
 * @Version 1.0
 **/
public interface UserDao {
    /**
     * 通过账号和密码查询用户
     */
    public User findUser(@Param("usercode") String usercode, @Param("password") String password);
}
