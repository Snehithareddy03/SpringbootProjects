package com.example.EmployeeDetails.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employeedto {
    private Long employeeid;
    private String name;
    private double salary;
}
