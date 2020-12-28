package com.grapefruit.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BeanApplication.class);
        application.run(args);
    }
}
