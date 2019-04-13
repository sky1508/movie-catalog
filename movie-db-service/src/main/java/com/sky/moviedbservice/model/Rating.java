package com.sky.moviedbservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating", catalog = "test")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rating_id")
    private Integer ratingId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name="rating")
    private Integer rating;

    public Rating(String userName, String movieName, Integer rating) {
        this.userName = userName;
        this.movieName = movieName;
        this.rating = rating;
    }

    public Rating(String movieName, Integer rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    public Rating() {
    }

    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
