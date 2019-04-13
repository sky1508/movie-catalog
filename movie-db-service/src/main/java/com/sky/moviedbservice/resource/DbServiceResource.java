package com.sky.moviedbservice.resource;

import com.sky.moviedbservice.model.Movie;
import com.sky.moviedbservice.model.Movies;
import com.sky.moviedbservice.model.Rating;
import com.sky.moviedbservice.model.Ratings;
import com.sky.moviedbservice.repository.UserMovieRepository;
import com.sky.moviedbservice.repository.UserRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/db")
public class DbServiceResource {

    @Autowired
    private UserMovieRepository userMovieRepository;

    @Autowired
    private UserRatingRepository userRatingRepository;

    @GetMapping("/{username}")
    public List<String> getMovieRatingByUserName(@PathVariable("username") final String username) {
        return getMovieRatingNameByUserName(username);
    }

    /*@PostMapping("/add")
    public List<String> addMovie(@RequestBody final Movies movies){
        *//*movies.getMovies()
                .stream()
                .map(movie -> new Movie(movies.getUsername(), movie))
                .forEach(movie -> userMovieRepository.save(movie));
        *//*
        return getRatingByUserName(movies.getUsername());
    }*/

    @PostMapping("/addrating")
    public String addRating(@RequestBody final Ratings ratingsVar){
        ratingsVar.getRatingsList()
                .stream()
                .map(rating -> new Rating(rating.getUserName(), rating.getMovieName(), rating.getRating()))
                .forEach(rating -> userRatingRepository.save(rating));

        return "true";
    }

    private List<String> getMovieNameByUserName(@PathVariable("username") final String username) {
        return userRatingRepository.findMovieByUserName(username)
                .stream()
                .map(rating -> rating.getMovieName())
                .collect(Collectors.toList());
    }

    private List<String> getMovieRatingNameByUserName(@PathVariable("username") final String username) {

          return userRatingRepository.findMovieByUserName(username)
                .stream()
                .flatMap(rating -> Stream.of(rating.getMovieName(),rating.getRating().toString()))
                .collect(Collectors.toList());
    }
}
