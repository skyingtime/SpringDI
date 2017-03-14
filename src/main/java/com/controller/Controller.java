package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KevinL on 14/03/2017.
 */
@RestController
@RequestMapping(value="/api")
public class Controller {

    @Autowired
    private UserService userService;

    @RequestMapping(value="user/{name}", method = RequestMethod.GET)
    public User getUser(@PathVariable("name") String name) {
        return userService.helloUser(name);
    }
}
