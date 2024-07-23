package com.brixton.demodata.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Category extends Audit implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -3942285530464977887L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String detail;

//    @OneToMany(cascade = CascadeType.DETACH, orphanRemoval = true)
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private Set<Buy> products = new HashSet<Buy>();

    public Category() {

    }

    public Category(String name, String detail) {
        super();
        this.name = name;
        this.detail = detail;
    }



}
