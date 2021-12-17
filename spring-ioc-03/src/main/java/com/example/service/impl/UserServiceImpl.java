package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.SysUser;
import com.example.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao dao = null;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(SysUser user) {
        dao.insertUser(user);
    }


}
