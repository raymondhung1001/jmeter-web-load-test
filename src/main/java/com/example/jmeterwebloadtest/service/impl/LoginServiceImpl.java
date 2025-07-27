package com.example.jmeterwebloadtest.service.impl;

import com.example.jmeterwebloadtest.dao.UserDao;
import com.example.jmeterwebloadtest.entity.User;
import com.example.jmeterwebloadtest.service.LoginService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Stateless
public class LoginServiceImpl implements LoginService {

    @Inject
    private UserDao userDao;

    @Override
    public Boolean login(String username, String password) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("username", username);
        params.put("password", password);
        List<User> users = userDao.filterBy(params);
        return !users.isEmpty();
    }
}
