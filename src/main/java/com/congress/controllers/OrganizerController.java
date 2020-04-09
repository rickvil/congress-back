package com.congress.controllers;

import com.congress.domain.Organizer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("organizer")
public class OrganizerController {

    @GetMapping("all")
    public List<Organizer> getAll(){
        Organizer organizer = Organizer.builder()
                .name("organizer name uno")
                .description("organizer description dos")
                .image("organizer image tres")
                .build();

        return Stream.of(organizer).collect(Collectors.toList());
    }
}
