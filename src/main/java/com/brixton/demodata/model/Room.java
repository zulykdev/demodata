package com.brixton.demodata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ROOM")
@Getter
@Setter
public class Room extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;

    // Otros atributos de la clase Room

    @OneToMany(mappedBy = "room")
    private Set<RoomxRoomType> roomxRoomTypes = new HashSet<>();

}
