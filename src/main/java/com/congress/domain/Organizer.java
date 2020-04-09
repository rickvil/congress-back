package com.congress.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Organizer {
    private String name;
    private String description;
    private String image;
}
