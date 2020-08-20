/*
 * Copyright (c) 2020 GREENBLOG.
 *
 * Created by IntelliJ IDEA.
 * @author: Reza Shams <rezashams86@gmail.com>
 */
package com.greenblog.app.service;

import com.greenblog.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users = Arrays.asList(new User[] { new User(1,"reza","shams","rezashams86@gmail.com"),
            new User(2,"Javad","Khosravian","javadKhosravian@gmail.com")});

    public  List<User> GetUserInfos(){
        return users;
    }
}