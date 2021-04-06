package com.zjl.consumer8080.controller;

import com.zjl.api.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    private static final String REST_URL_PREFIX = "http://servant-user-8090/";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/info/{id}")
    public User info(@PathVariable("id") Long id) {
        return restTemplate.getForObject("http://servant-user-8090/info/{1}", User.class, id);
    }
}
