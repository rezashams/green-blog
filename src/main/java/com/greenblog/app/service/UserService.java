/*
 * Copyright (c) 2020 GREENBLOG.
 *
 * Created by IntelliJ IDEA.
 * @author: Reza Shams <rezashams86@gmail.com>
 */
package com.greenblog.app.service;

import com.greenblog.model.User;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>(Arrays.asList(new User[] { new User(1,"reza","shams","rezashams86@gmail.com"),
            new User(2,"Javad","Khosravian","javadKhosravian@gmail.com")}));

    public  List<User> getUserInfos(){
        return users;
    }
    public User getUserInfo(int id) {
        return users.stream().filter(t->t.getId()==id).findFirst().get();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void updateUser(int id, User user) {
        for(int i=0; i<users.size(); i++)
            if(users.get(i).getId() == id) {
                users.set(i, user);
                return;
            }
    }

    public void deleteUser(int id) {
        users.removeIf(t -> t.getId() == id);
    }
}