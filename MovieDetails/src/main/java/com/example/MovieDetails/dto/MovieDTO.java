package com.example.MovieDetails.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {
    private Long movieId;
    private String name;
    private int year;
    private String director;
}

