package com.example.jmeterwebloadtest.dao.impl;

import com.example.jmeterwebloadtest.dao.UserDao;
import com.example.jmeterwebloadtest.entity.User;
import com.example.jmeterwebloadtest.dao.AbstractDAO;

import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Stateless
public class UserDaoImpl extends AbstractDAO<User> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }

    @Override
    public List<User> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> root = cq.from(User.class);
        cq.select(root);
        return em.createQuery(cq).getResultList();
    }

}
