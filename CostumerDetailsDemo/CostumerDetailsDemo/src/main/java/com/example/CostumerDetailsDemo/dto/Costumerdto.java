package com.example.CostumerDetailsDemo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Costumerdto {
    private Long id;
    private String name;
    private  double price;
}
