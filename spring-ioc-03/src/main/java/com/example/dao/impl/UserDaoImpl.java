package com.example.dao.impl;

import com.example.dao.UserDao;
import com.example.entity.SysUser;

public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("user插入到mysql数据库");
    }
}
