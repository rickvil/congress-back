package com.congress.controllers;

import com.congress.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("restaurant")
public class RestaurantController {

    @GetMapping("all")
    public List<Restaurant> getAll(){
        Restaurant restaurant = Restaurant.builder()
                .name("restaurant name uno")
                .address("restaurant address dos")
                .image("restaurant image tres")
                .build();

        return Stream.of(restaurant).collect(Collectors.toList());
    }
}
