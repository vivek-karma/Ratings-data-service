package com.vivek.ratingsdataservice.resource;

import com.vivek.ratingsdataservice.model.Rating;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingResource {

    @RequestMapping("{movieName}")
    public Rating getRating(String movie){

        return  new Rating(4);

    }
}
