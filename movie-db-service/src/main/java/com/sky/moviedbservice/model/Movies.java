package com.sky.moviedbservice.model;

import java.util.List;

public class Movies {

    private String username;
    private List<String> movies;

    public Movies() {
    }

    public Movies(String username, List<String> movies) {
        this.username = username;
        this.movies = movies;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }
}


