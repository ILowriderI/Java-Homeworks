package com.example.javaprohw9.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String surname;
    String phoneNumber;
    String gander;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY ,mappedBy = "user")

    private List <Device> deviceList;

    public void addDeviceToUser(Device device){
        device.setUser(this);
        deviceList.add(device);


    }



}
