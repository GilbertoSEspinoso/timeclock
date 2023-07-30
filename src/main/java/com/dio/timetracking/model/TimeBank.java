package com.dio.timetracking.model;

import lombok.*;

import javax.persistence.EmbeddedId;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class TimeBank {
    @EmbeddedId
    private TimeBankMovement id;
    private LocalDateTime workedDate;
    private BigDecimal workedHours;
    private LocalDateTime hoursBalance;
}
