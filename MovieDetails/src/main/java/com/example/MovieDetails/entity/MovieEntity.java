package com.example.MovieDetails.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="movie_details")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    private String name;
    private int year;
    private String director;
}
