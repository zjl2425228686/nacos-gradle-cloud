package com.zjl.api.service;

import com.zjl.api.pojo.User;
import com.zjl.api.service.fallbackFactory.UserServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "servant-user-8090", fallbackFactory = UserServiceFallbackFactory.class)
public interface UserService {
    @GetMapping("info/{id}")
    User info(@PathVariable("id") Long id);
}
