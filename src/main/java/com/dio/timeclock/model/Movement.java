package com.dio.timeclock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "tb_movement")
public class Movement {
    @EmbeddedId
    @Id
    private MovementId id;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private BigDecimal period;
    @ManyToOne
    private Event event;
    @ManyToOne
    private Calendar calendar;
}
