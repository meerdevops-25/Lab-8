package com.example.factorymethodproduct.model;

import jakarta.persistence.*;
/**
 * @author Abdul Moiz Meer
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type", discriminatorType = DiscriminatorType.STRING)
public abstract class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    @Column(name = "product_type", insertable = false, updatable = false)
    private String productType;

    protected ProductEntity(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public ProductEntity() {}

    // Getters and Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getProductType() { return productType; }
}
