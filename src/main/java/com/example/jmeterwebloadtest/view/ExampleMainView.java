package com.example.jmeterwebloadtest.view;

import com.example.jmeterwebloadtest.entity.User;
import com.example.jmeterwebloadtest.service.UserService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@Named("exampleMainView")
public class ExampleMainView implements Serializable {

    private static final long serialVersionUID = -1951467905215041028L;

    @Inject
    private UserService userService;

    private List<User> users;

    @PostConstruct
    public void init() {
        users = new ArrayList<User>();
    }

    public void test() {
        users = userService.getAllUsers();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
