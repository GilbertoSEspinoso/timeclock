package com.dio.timeclock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "tb_date_type")
public class DateType {
    @Id
    private Long id;
    private String description;
}
