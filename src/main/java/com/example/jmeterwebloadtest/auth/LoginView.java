package com.example.jmeterwebloadtest.auth;

import com.example.jmeterwebloadtest.entity.User;
import com.example.jmeterwebloadtest.service.LoginService;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

@ViewScoped
@Named("loginView")
public class LoginView implements Serializable {

    private static final long serialVersionUID = -1385681953656298924L;

    @Inject
    private LoginService loginService;

    private User user;

    @PostConstruct
    public void init() {
        user = new User();
    }

    public String login() {
        Boolean loginPassed = loginService.login(user.getUsername(), user.getPassword());
        if (loginPassed) {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
                    .getExternalContext().getSession(false);
            session.setAttribute("user", user.getUsername());
            user = new User();
            return "/secured/index.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String logout() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
        session.invalidate();
        return "/login.xhtml?faces-redirect=true";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
