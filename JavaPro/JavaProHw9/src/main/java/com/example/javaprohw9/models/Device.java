package com.example.javaprohw9.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "devices")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Device {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String macAddress;


    @JsonIgnore
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)

    private User user;

}
