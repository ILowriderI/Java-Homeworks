package com.example.javaprohw5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
public class MyRepo {
    private List data;
    @PostConstruct
    void startRepo(){
        System.out.println("start repository");
    }

    @PreDestroy
    void closeRepo(){
        System.out.println("stop repository");
    }
}
