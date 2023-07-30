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
public class MovementId implements Serializable {
    private Long idMovement;
    private Long idUser;
}
