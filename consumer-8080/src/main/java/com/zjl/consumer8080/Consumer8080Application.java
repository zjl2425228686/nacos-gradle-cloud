package com.zjl.consumer8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.zjl"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.zjl"})
public class Consumer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer8080Application.class, args);
    }
}
