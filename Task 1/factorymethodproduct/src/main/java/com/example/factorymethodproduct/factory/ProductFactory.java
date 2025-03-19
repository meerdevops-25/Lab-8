package com.example.factorymethodproduct.factory;

import com.example.factorymethodproduct.model.ProductEntity;
import com.example.factorymethodproduct.model.Electronics;
import com.example.factorymethodproduct.model.Clothing;
import com.example.factorymethodproduct.model.Books;
import org.springframework.stereotype.Component;
/**
 * @author Abdul Moiz Meer
 */
@Component
public class ProductFactory {

    public ProductEntity createProduct(String type, String name, double price) {
        return switch (type.toLowerCase()) {
            case "electronics" -> new Electronics(name, price);
            case "clothing" -> new Clothing(name, price);
            case "books" -> new Books(name, price);
            default -> throw new IllegalArgumentException("Invalid product type: " + type);
        };
    }
}
