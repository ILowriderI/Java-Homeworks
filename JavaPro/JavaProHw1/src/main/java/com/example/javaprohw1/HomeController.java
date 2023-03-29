package com.example.javaprohw1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String showHomeMessage(){
        return "Hello Spring";
    }



}
