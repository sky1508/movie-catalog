package com.sky.ratingsdataservice.resource;

import com.sky.ratingsdataservice.model.Rating;
import com.sky.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> rating =  Arrays.asList(
                new Rating("123", 4),
                new Rating("456",5)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(rating);
        return userRating;
    }
}
