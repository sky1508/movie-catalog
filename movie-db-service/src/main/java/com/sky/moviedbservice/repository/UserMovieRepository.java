package com.sky.moviedbservice.repository;

import com.sky.moviedbservice.model.Movie;
import com.sky.moviedbservice.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMovieRepository extends JpaRepository<Movie, Integer> {

    String findByMovieId(String username);
}
