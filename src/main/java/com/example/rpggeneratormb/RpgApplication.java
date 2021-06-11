package com.example.rpggeneratormb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})

public class RpgApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpgApplication.class, args);
    }
}
