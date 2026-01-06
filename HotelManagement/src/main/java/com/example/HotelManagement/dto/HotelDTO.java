package com.example.HotelManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class HotelDTO {
    private Long hotelId;
    private String name;
    private double cost;
}
