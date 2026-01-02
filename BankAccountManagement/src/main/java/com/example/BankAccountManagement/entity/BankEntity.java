package com.example.BankAccountManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Bank_account_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long accountId;
    private String name;
    private String accountType;
    private double balance;

}
