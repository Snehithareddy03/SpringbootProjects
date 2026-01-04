package com.example.MovieDetails.controller;

import com.example.MovieDetails.dto.MovieDTO;
import com.example.MovieDetails.entity.MovieEntity;
import com.example.MovieDetails.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movie")
public class MovieController {
    @Autowired
    private MovieService service;
    @PostMapping("/savemovie")
    public ResponseEntity<MovieDTO> createMovie (@RequestBody MovieDTO moviedto){
        MovieDTO m1 = service.createMovie(moviedto);
        return new ResponseEntity<>(m1, HttpStatus.OK);

    }
    @GetMapping("/{movieId}")
    public ResponseEntity<MovieEntity> getMovie(@PathVariable Long movieId){
        MovieEntity m2 = service.getMovie(movieId);
        return new ResponseEntity<>(m2,HttpStatus.OK);
    }
    @PutMapping("/{movieId}")
    public ResponseEntity<MovieDTO> updateMovie(@PathVariable   Long movieId,@RequestBody MovieDTO moviedto){
        MovieDTO m3 = service.updateMovie(movieId,moviedto);
        return new ResponseEntity<>(m3,HttpStatus.CREATED);
    }
    @DeleteMapping("/{movieId}")
    public ResponseEntity<String> deleteMovie(@PathVariable Long movieId){
        service.deleteMovie(movieId);
        return ResponseEntity.ok("deleted successfully");
    }
}