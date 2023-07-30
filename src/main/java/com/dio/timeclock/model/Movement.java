package com.dio.timeclock.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.ManyToOne;
import lombok.*;

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
