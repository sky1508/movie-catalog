package com.sky.moviedbservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie", catalog = "test")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name="movie_name")
    private Integer movieName;

    public Movie() {
    }

    public Movie(Integer movieId, Integer movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getMovieName() {
        return movieName;
    }

    public void setMovieName(Integer movieName) {
        this.movieName = movieName;
    }
}
