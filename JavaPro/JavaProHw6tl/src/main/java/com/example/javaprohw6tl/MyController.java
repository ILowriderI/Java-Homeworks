package com.example.javaprohw6tl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("test")
    public  String test(Model model){
        model.addAttribute("test","hello");
        return  "index";
    }

}
