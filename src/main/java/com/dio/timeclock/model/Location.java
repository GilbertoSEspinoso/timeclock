package com.dio.timeclock.model;

import jakarta.persistence.OneToMany;
import lombok.*;

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
