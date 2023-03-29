package com.example.javaprohw1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class PhraseController {


   @GetMapping("/phrase")
    public String getRandomPhrase(){
       List <String > phrases = new ArrayList <>();
       phrases.add("Wise men speak because they have something to say; fools because they have to say something.");
       phrases.add("Chop your own wood and it will warm you twice.");
       phrases.add("Life is far too important a thing ever to talk seriously about.");
       phrases.add("Keep smiling, because life is a beautiful thing and there's so much to smile about");
       phrases.add("Life is a series of choices.");
       phrases.add("The purpose of life is to live correctly, think correctly, and act correctly.");
       phrases.add("The first thing you learn in life is you're a fool. The last thing you learn in life is you're the same fool. ");
       phrases.add("In the middle of difficulty lies opportunity.");
       phrases.add("And if you gaze long into an abyss, the abyss also gazes into you. ");
       phrases.add("My mom always said life was like a box of chocolates. You never know what you're gonna get.");

       Random rnd = new Random();
       
       return phrases.get(rnd.nextInt(phrases.size()));
    }


}
