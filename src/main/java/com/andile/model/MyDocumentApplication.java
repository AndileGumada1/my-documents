package com.andile.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MyDocumentApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MyDocumentApplication.class,args);
    }
}
