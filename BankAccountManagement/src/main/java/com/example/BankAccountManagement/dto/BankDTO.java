package com.example.BankAccountManagement.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDTO {
    private Long accountId;
    private String name;
    private String accountType;
    private double balance;
}
