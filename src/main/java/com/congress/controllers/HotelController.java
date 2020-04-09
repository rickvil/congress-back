package com.congress.controllers;

import com.congress.domain.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("hotel")
public class HotelController {

    @GetMapping("all")
    public List<Hotel> getAll(){
        Hotel hotel = Hotel.builder()
                .name("hotel name uno")
                .address("hotel address dos")
                .image("hotel image tres")
                .build();

        return Stream.of(hotel).collect(Collectors.toList());
    }
}
