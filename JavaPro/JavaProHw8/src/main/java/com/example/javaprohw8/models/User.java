package com.example.javaprohw8.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    long id;
    String name;
    String surname;
    String phoneNumber;
    String gander;


}
