package com.zjl.consumer8080.controller;

import com.zjl.api.pojo.User;
import com.zjl.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/user/info/{id}")
    public User info(@PathVariable("id") Long id) {
        return service.info(id);
    }
}
