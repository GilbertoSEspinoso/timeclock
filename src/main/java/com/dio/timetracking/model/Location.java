package com.dio.timetracking.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Location {
    private Long id;
    private String description;
    @OneToMany
    private AccessLevel accessLevel;
}
