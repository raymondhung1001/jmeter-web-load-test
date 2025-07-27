package com.example.jmeterwebloadtest.dao;

import com.example.jmeterwebloadtest.entity.User;

import java.util.List;

public interface UserDao extends GenericDAO<User> {

    List<User> findAll();

}
