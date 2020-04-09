package com.congress.controllers;

import com.congress.domain.Speaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("speaker")
public class SpeakerController {

    @GetMapping("all")
    public List<Speaker> getAll(){
        Speaker speaker = Speaker.builder()
                .name("speaker name suno")
                .description("speaker description dos")
                .image("speaker image tres")
                .build();

        return Stream.of(speaker).collect(Collectors.toList());
    }
}
