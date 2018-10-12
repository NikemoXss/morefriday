package com.more.enter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@ComponentScan(basePackages = {"com.more"})
@SpringBootApplication
public class EnterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnterApplication.class, args);
    }
}
