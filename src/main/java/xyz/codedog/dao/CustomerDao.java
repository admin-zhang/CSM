package xyz.codedog.dao;

import xyz.codedog.po.Customer;

import java.util.List;

/**
 * @ClassName CustomerDao
 * @Description TODO
 * @Author panda
 * @Date 2020/5/15
 * @Version 1.0
 **/
public interface CustomerDao {
    //  客户列表
    public List<Customer> selectCustomerList(Customer customer);

    //  客户数
    public Integer selectCustomerListCount(Customer customer);
}
