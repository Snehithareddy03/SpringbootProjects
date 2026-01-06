package com.example.SportsPlayerDetails.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportsDTO {
    private Long playerId;
    private String playerName;
    private String sportName;
    private int age;
    private String gender;
}
