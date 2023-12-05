package com.dipesh.jwt.jwtauth.services;

import com.dipesh.jwt.jwtauth.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();
    public UserService()
    {
        userList.add(new User(UUID.randomUUID().toString(),"DIPESH MISHRA","dipesh@dev.com"));
        userList.add(new User(UUID.randomUUID().toString(),"PRANAV KUMAR","pranav@dev.com"));
        userList.add(new User(UUID.randomUUID().toString(),"DINO KUMAR","dino@qa.com"));
        userList.add(new User(UUID.randomUUID().toString(),"MOHIT CHAUHAN","mohit@dev.com"));
    }

    public List<User> getUserList()
    {
        return this.userList;
    }
}
