package com.zjl.servantuser8090.service.impl;

import com.zjl.api.pojo.User;
import com.zjl.servantuser8090.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User info(Long id) {
        User user = new User();
        user.setId(id);
        user.setAge(new Random().nextInt(50) % (50 - 0 + 1) + 0);
        user.setName("张三" + id);
        return user;
    }
}
