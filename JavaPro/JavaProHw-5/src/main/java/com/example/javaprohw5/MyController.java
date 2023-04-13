package com.example.javaprohw5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String string(){
        return "message";
    }


    @PostConstruct
 void startController(){
        System.out.println("start controller");
 }

 @PreDestroy
    void closeController(){
        System.out.println("stop controller");
 }
}
