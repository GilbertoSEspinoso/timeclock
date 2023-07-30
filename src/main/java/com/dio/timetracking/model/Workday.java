package com.dio.timetracking.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Workday {
    private Long id;
    private String description;
}
