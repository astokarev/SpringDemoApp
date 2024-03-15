package com.example.springdemoapp;

import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SpringDemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoAppApplication.class, args);
    }

}
