package com.service;

import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by KevinL on 14/03/2017.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private User user;

    @Override
    public User helloUser(String userName) {
        user.setName(userName);
        user.setAge(30);
        return user;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
