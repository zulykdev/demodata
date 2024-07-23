package com.brixton.demodata.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -8698757387767929675L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id")
    Category category;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "supplier_id")
    Supplier supplier;

    String unitOfMeasure;
    String alertQuantity;
    String supplierPrice;
    String sellPrice;
    String productCode;
    String productTax;
    String detail;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private Set<Buy> buys = new HashSet<Buy>();

    public Product() {

    }

    public Product(String name, Category category, Supplier supplier, String unitOfMeasure, String alertQuantity, String supplierPrice, String sellPrice, String productCode, String productTax, String detail) {
        this.name = name;
        this.category = category;
        this.supplier = supplier;
        this.unitOfMeasure = unitOfMeasure;
        this.alertQuantity = alertQuantity;
        this.supplierPrice = supplierPrice;
        this.sellPrice = sellPrice;
        this.productCode = productCode;
        this.productTax = productTax;
        this.detail = detail;
    }
}
