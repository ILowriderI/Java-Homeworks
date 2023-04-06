package com.example.javaprohw3;


import jakarta.validation.constraints.Size;

public class Item {
     private Integer id;

    @Size(max = 20)
    private String item;

    public String getItem() {
        return item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
