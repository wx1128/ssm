package com.zy.ssm.dao;

import com.zy.ssm.entity.User;

import java.util.List;

/**
 * ClassName:UserDao
 * Package:com.zy.ssm.dao
 * Description:
 *
 * @Date:2021/6/8 17:43
 * @Author:wx112820@163.com
 */
public interface UserDao {
    //查询所有用户
    List<User> AllUser();
    //修改用户密码
    boolean upUser(String userName,String passWord);
    //    登录验证
    boolean loginUser(String userName,String passWord);
}
