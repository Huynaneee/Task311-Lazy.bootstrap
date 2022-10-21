package com.example.Task311.controller;


import com.example.Task311.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRESTController {

    @Autowired
    public UserRESTController() {
    }

    @GetMapping("/users/name")
    public User showUserName(@AuthenticationPrincipal User user) {
        return user;
    }
}
