package com.brixton.demodata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ROOMTYPE")
@Getter
@Setter
public class RoomType extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "roomType")
    private Set<RoomxRoomType> roomxRoomTypes = new HashSet<>();
}
