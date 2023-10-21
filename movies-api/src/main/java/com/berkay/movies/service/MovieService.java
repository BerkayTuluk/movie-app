package com.berkay.movies.service;

import com.berkay.movies.model.Movie;
import com.berkay.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        return repository.findAll();
    }

    public Optional<Movie> singleMovie (String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}
