package com.example.javaprohw2;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ArticleController {

   @GetMapping("/")
   public String homeMessage(){
       return "get all the items - input: /article     " +"<br>" +
               "  get item by id - input: /article?id=(article number should be here) ";
   }

    @GetMapping("/article")
    public String getItem(HttpServletRequest request){
        Map<Integer,String> items = new HashMap<Integer, String>();
        for(int i = 1;i<11;i++){
            items.put(i,"Article # " + i);
        }

        if(request.getParameter("id") ==null){
            return items.values().toString();
        }else{
            Integer id = Integer.valueOf(request.getParameter("id"));
            if(id> items.size()||id<1){
                return "article not found";
            }
            return  items.get(id);
        }

    }
}
