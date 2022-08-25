package com.example.inps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(InpsApplication.class, args);
    }

}
