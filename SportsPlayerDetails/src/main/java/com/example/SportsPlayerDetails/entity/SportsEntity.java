package com.example.SportsPlayerDetails.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="sports_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerId;
    private String playerName;
    private String sportName;
    private int age;
    private String gender;
}
