package com.example.jmeterwebloadtest.service.impl;

import com.example.jmeterwebloadtest.dao.UserDao;
import com.example.jmeterwebloadtest.entity.User;
import com.example.jmeterwebloadtest.service.UserService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
