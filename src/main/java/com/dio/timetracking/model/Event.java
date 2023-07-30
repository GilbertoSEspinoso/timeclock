package com.dio.timetracking.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Event {
    private Long id;
    private String name;
    private String description;
}
