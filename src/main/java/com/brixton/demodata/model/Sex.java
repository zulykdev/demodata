package com.brixton.demodata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Setter
@Getter
@Table(name = "Sexo")
public class Sex extends Audit{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30)
    private String descripcion;

    private LocalDate miVariableLocal;

    private LocalDateTime mivariabledatetime;

    private LocalTime mivariableTime;

    @Column(length = 20)
    private String registryStatus;

}
