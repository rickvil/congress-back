package com.congress.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Restaurant {
    public String name;
    public String address;
    public String image;
}
