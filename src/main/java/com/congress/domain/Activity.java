package com.congress.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Activity {
    private String name;
    private String schedule;
    private String topic;
    private String image;
}
