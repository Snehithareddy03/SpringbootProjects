package com.example.SalesManagement.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sales_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salesId;
    private String name;
    private int total_amount;
}
