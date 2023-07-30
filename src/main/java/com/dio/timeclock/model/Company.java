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
@Table(name = "tb_company")
public class Company {
    @Id
    private Long id;
    private String description;
    private String cnpj;
    private String address;
    private String neighborhood;
    private String city;
    private String state;
    private String phoneNumber;
}
