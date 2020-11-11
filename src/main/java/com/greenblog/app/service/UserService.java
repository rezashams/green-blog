/*
 * Copyright (c) 2020 GREENBLOG.
 *
 * Created by IntelliJ IDEA.
 * @author: Reza Shams <rezashams86@gmail.com>
 */
package com.greenblog.app.service;

import com.greenblog.model.User;
import com.greenblog.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public  List<User> getUsers(){
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add);
        return users;
    }
    public User getUser(int id) {
        return userRepo.findById(id).get();
    }

    public void addUser(User user) {
        userRepo.save(user);
    }

    public void updateUser(int id, User user) {
        userRepo.save(user);
    }

    public void deleteUser(int id) {
        userRepo.deleteById(id);
        //users.removeIf(t -> t.getId() == id);
    }
}