package com.example.SalesManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesDTO {
    private Long salesId;
    private String name;
    private int total_amount;
}