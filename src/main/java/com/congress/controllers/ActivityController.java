package com.congress.controllers;

import com.congress.domain.Activity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("activity")
public class ActivityController {

    @GetMapping("all")
    public List<Activity> getAll(){
        Activity activity = Activity.builder()
                .name("actividad name uno")
                .schedule("actividad schedule dos")
                .topic("actividad topic tres")
                .image("actividad image cuatro")
                .build();

        return Stream.of(activity).collect(Collectors.toList());
    }
}
