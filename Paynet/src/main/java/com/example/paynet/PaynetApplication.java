package com.example.paynet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaynetApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaynetApplication.class, args);
    }

}

