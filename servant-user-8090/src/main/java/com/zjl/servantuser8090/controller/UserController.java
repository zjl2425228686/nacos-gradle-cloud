package com.zjl.servantuser8090.controller;

import com.zjl.api.pojo.User;
import com.zjl.servantuser8090.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/info/{id}")
    public User info(@PathVariable("id") Long id) {
        return service.info(id);
    }
}
