package com.dio.timeclock.model;

import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendar {
    private Long id;
    private String description;
    private LocalDateTime especialDate;
    @ManyToOne
    private DateType dateType;

}
