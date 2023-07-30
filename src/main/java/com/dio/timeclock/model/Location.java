package com.dio.timeclock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "tb_location")
public class Location {
    @Id
    private Long id;
    private String description;
    @ManyToOne
    private AccessLevel accessLevel;
}
