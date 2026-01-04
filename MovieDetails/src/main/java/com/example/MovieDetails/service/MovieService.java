package com.example.MovieDetails.service;

import com.example.MovieDetails.dto.MovieDTO;
import com.example.MovieDetails.entity.MovieEntity;


public interface MovieService {
    MovieDTO createMovie(MovieDTO moviedto);
    MovieEntity getMovie(Long movieId);
    MovieDTO updateMovie(Long movieId,MovieDTO moviedto);
    void deleteMovie(Long movieId);
}
