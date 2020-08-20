/*
 * Copyright (c) 2020 GREENBLOG.
 *
 * Created by IntelliJ IDEA.
 * @author: Reza Shams <rezashams86@gmail.com>
 */
package com.greenblog.controller;

import com.greenblog.app.service.UserService;
import com.greenblog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private UserService userService;


    @RequestMapping("/profile")
    public User getUserInfo() {
         return new User(1,"reza","shams","rezashams86@gmail.com");
     }

    @RequestMapping("/profiles")
    public List<User> getUserInfos() {
        return userService.GetUserInfos();
    }
}