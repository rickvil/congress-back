package com.congress.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Speaker {
    public String name;
    public String description;
    public String image;
}
