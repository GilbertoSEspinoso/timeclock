package com.dio.timeclock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name = "tb_user")
public class User {
    @Id
    private Long id;
    private String name;
    private BigDecimal delayTolerance;
    private LocalDateTime workdayStartTime;
    private LocalDateTime workdayEndTime;
    @ManyToOne
    private UserCategory userCategory;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private Workday workday;
}
