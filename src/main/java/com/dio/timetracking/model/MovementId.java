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
public class MovementId implements Serializable {
    private Long idMovement;
    private Long idUser;
}
