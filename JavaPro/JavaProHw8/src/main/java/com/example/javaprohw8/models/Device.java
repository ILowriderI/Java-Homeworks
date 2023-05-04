package com.example.javaprohw8.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {

    long id;
    String name;
    String macAddress;
    long userId;



}
