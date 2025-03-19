package com.example.factorymethodproduct.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
/**
 * @author Abdul Moiz Meer
 */
@Entity
@DiscriminatorValue("electronics")
public class Electronics extends ProductEntity {
    public Electronics(String name, double price) {
        super(name, price);
    }

    public Electronics() {}
}
