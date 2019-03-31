package com.sky.moviecatalogservice.resource;

import com.sky.moviecatalogservice.model.CatalogItem;
import com.sky.moviecatalogservice.model.Movie;
import com.sky.moviecatalogservice.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        List<Rating> ratings = Arrays.asList(
                new Rating("123",4),
                new Rating("456",5)
        );

        return ratings.stream().map(rating -> {
                    Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
                    return new CatalogItem(movie.getName(),"desc",rating.getRating());
                })
                .collect(Collectors.toList());

        /*return Collections.singletonList(
                new CatalogItem("Transformers","Test",4)
        );*/
    }
}
