package com.example.MovieDetails.service.movieserviceimpl;

import com.example.MovieDetails.dto.MovieDTO;
import com.example.MovieDetails.entity.MovieEntity;
import com.example.MovieDetails.repository.MovieRepository;
import com.example.MovieDetails.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceimpl implements MovieService {
    @Autowired
    private MovieRepository repo;
    @Override
    public MovieDTO createMovie(MovieDTO moviedto){
        MovieEntity m1 = new MovieEntity(
                moviedto.getMovieId(),
                moviedto.getName(),
                moviedto.getYear(),
                moviedto.getDirector()
        );
        MovieEntity saved = repo.save(m1);
        MovieDTO m2 = new MovieDTO(
                saved.getMovieId(),
                saved.getName(),
                saved.getYear(),
                saved.getDirector()
        );
        return m2;

    }

    @Override
    public MovieEntity getMovie(Long movieId) {
        return repo.findBymovieId(movieId);
    }
    public MovieDTO updateMovie(Long movieId,MovieDTO moviedto){
        MovieEntity movie = repo.findBymovieId(movieId);
        movie.setDirector(moviedto.getDirector());
        movie.setName(moviedto.getName());
        movie.setYear(moviedto.getYear());

    MovieEntity updatedmovie = repo.save(movie);
    return new MovieDTO(
            updatedmovie.getMovieId(),
            updatedmovie.getName(),
            updatedmovie.getYear(),
            updatedmovie.getDirector()
    );
    }

    @Override
    public void deleteMovie(Long movieId) {
        MovieEntity deleted = repo.findBymovieId(movieId);
        repo.delete(deleted);
    }
}
