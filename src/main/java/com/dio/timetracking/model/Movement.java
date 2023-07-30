package com.dio.timetracking.model;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movement {
    @EmbeddedId
    private MovementId id;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private BigDecimal period;
    @ManyToOne
    private Event event;
    @ManyToOne
    private Calendar calendar;
}
