package com.dio.timetracking.model;

import lombok.*;

import javax.persistence.Embeddable;
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
