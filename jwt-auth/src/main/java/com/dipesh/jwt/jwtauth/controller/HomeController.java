package com.dipesh.jwt.jwtauth.controller;

import com.dipesh.jwt.jwtauth.model.User;
import com.dipesh.jwt.jwtauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUser()
    {
        return this.userService.getUserList();
    }

    @GetMapping("/user-info")
    public String getUserInfo(Principal principal)
    {
        return "User logged in is: "+principal.getName();
    }
}
