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
import org.springframework.web.bind.annotation.*;

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
        return userService.getUserInfos();
    }

    @RequestMapping( "/profiles/{id}")
    public User getUserInfo( @PathVariable  int id) {
        return userService.getUserInfo(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/profiles")
    public  void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/profiles/{id}")
    public void updateUser(@RequestBody User user,@PathVariable int id) {
        userService.updateUser(id, user);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/profiles/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}