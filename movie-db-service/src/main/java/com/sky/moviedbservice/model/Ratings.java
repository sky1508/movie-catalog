package com.sky.moviedbservice.model;

import java.util.List;
import java.util.Map;

public class Ratings {

    private String username;
    private List<Rating> ratingsList;

    public Ratings(String username, List<Rating> ratingsList) {
        this.username = username;
        this.ratingsList = ratingsList;
    }

    public Ratings() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Rating> getRatingsList() {
        return ratingsList;
    }

    public void setRatingsList(List<Rating> ratingsList) {
        this.ratingsList = ratingsList;
    }
}
