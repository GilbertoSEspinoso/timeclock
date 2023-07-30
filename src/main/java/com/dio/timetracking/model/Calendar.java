package com.dio.timetracking.model;

import lombok.*;

import javax.persistence.ManyToOne;
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
