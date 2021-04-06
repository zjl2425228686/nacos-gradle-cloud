package com.zjl.servantuser8090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServantUser8090Application {

    public static void main(String[] args) {
        SpringApplication.run(ServantUser8090Application.class, args);
    }

}
