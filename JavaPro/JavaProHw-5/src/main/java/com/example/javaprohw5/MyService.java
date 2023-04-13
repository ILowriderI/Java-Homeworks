package com.example.javaprohw5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service(value = "name")
@Data

public class MyService {
    private String service;
    @PostConstruct
    void startService(){
        System.out.println("start service");
    }

    @PreDestroy
    void closeService(){
        System.out.println("stop service");
    }
}
