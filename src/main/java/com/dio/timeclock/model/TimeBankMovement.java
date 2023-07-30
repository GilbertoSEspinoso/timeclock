package com.dio.timeclock.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Embeddable
public class TimeBankMovement implements Serializable {
    private Long idTimeBank;
    private Long idMovimentBank;
    private Long idUser;
}
