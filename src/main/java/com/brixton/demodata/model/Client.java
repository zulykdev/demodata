package com.brixton.demodata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Cliente")
@Getter
@Setter
public class Client extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 10)
    private String dni;

    @Column(length = 50)
    private String names;

    @Column(length = 100)
    private String lastname;

    @Column(length = 200)
    private String address;

    private LocalDate birthdate;

    @ManyToOne
    @JoinColumn(name = "sexo_id")
    private Sexo sexo;

}