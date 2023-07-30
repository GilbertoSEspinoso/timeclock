package com.dio.timeclock.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "tb_time_bank")
public class TimeBank {
    @Id
    @EmbeddedId
    private TimeBankMovement id;
    private LocalDateTime workedDate;
    private BigDecimal workedHours;
    private LocalDateTime hoursBalance;
}
