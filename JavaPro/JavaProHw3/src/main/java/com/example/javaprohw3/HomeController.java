package com.example.javaprohw3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class HomeController {

    @GetMapping("/")
    public String getHtml(){

        return "index.html";
    }
}
