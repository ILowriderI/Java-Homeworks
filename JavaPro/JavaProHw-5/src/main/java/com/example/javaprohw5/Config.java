package com.example.javaprohw5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @PostConstruct
    void startBean(){
        System.out.println("start bean");
    }

    @PreDestroy
    void closeBean(){
        System.out.println("stop bean");
    }
    @Bean(value = "@bean")
    public String messageBean() {
       return "Bean";
    }

}
