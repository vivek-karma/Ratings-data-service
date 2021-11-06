package com.vivek.ratingsdataservice.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingResource {

    @RequestMapping("{movieName}")
    public Integer getRating(String movie){
        return  4;
    }
}
