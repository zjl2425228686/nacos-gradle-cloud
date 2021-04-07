package com.zjl.api.service.fallbackFactory;

import com.zjl.api.pojo.User;
import com.zjl.api.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class UserServiceFallbackFactory implements FallbackFactory {
    @Override
    public UserService create(Throwable cause) {
        return new UserService() {
            @Override
            public User info(Long id) {
                User user = new User();
                user.setId(id);
                user.setAge(new Random().nextInt(50) % (50 - 0 + 1) + 0);
                user.setName("张三-服务降级" + id);
                return user;
            }
        };
    }
}
