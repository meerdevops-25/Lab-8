package com.example.prototypepattern.model;

import jakarta.persistence.*;
/**
 * @author Abdul Moiz Meer
 */
@Entity
@Table(name = "products")
public class Product implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private double price;
    private String color;

    public Product() {}

    public Product(String name, String category, double price, String color) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.color = color;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    // Clone Method for Prototype Pattern
    @Override
    public Product clone() {
        return new Product(this.name, this.category, this.price, this.color);
    }
}
