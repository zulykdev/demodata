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
public class Supplier extends Audit implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 3470927673791783361L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String phone;
    String email;
    String company;
    String address;

    String description;

//    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private Set<Buy> buys = new HashSet<Buy>();

    @OneToMany(cascade = CascadeType.DETACH, orphanRemoval = true, mappedBy = "supplier")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Set<Product> products = new HashSet<Product>();

//    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private Set<Expense> expenses = new HashSet<Expense>();

    public Supplier() {
        // TODO Auto-generated constructor stub
    }

    public Supplier(String name, String phone, String email, String company,
                    String address, String description) {
        super();
        this.address = address;
        this.company = company;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.description = description;
    }

}

