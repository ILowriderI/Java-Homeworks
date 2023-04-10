package com.example.javaprohw4;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Item {
    private Integer id;
    @Size(max = 20)
    private String item;
}
