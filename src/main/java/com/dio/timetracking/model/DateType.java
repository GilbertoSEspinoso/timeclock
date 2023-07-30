package com.dio.timetracking.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class DateType {
    private Long id;
    private String description;
}
