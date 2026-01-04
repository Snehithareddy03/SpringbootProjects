package com.example.MovieDetails.repository;

import com.example.MovieDetails.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
    MovieEntity findBymovieId(Long movieId);
}
