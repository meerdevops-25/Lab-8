package com.example.factorymethodproduct.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
/**
 * @author Abdul Moiz Meer
 */
@Entity
@DiscriminatorValue("books")
public class Books extends ProductEntity {
    public Books(String name, double price) {
        super(name, price);
    }

    public Books() {}
}
