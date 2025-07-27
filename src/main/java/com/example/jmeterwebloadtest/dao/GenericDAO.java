package com.example.jmeterwebloadtest.dao;

import java.util.List;
import java.util.Map;

public interface GenericDAO<T> {

    void create(T entity);

    T update(T entity);

    void delete(T entity);

    T find(Object id);

    List<T> findAll();

    List<T> filterBy(Map<String, Object> filters);

}