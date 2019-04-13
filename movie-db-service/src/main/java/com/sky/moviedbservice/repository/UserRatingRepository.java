package com.sky.moviedbservice.repository;

import com.sky.moviedbservice.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRatingRepository extends JpaRepository<Rating, Integer> {

    List<Rating> findMovieByUserName(String username);
}
