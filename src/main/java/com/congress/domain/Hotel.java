package com.congress.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hotel {
    private String name;
    private String address;
    private String image;
}
