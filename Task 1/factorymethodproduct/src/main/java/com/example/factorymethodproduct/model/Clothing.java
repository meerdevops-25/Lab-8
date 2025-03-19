package com.example.factorymethodproduct.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
/**
 * @author Abdul Moiz Meer
 */
@Entity
@DiscriminatorValue("clothing")
public class Clothing extends ProductEntity {
    public Clothing(String name, double price) {
        super(name, price);
    }

    public Clothing() {}
}
