package com.example.prototypepattern.service;

import com.example.prototypepattern.model.Product;
import com.example.prototypepattern.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
/**
 * @author Abdul Moiz Meer
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Method to create a new product
    public Product createProduct(String name, String category, double price, String color) {
        Product product = new Product(name, category, price, color);
        return productRepository.save(product);
    }

    // Method to clone an existing product with a different color
    public Product cloneProduct(Long productId, String newColor) {
        Optional<Product> existingProduct = productRepository.findById(productId);

        if (existingProduct.isPresent()) {
            Product clonedProduct = existingProduct.get().clone();
            clonedProduct.setColor(newColor);  // Set the new color
            return productRepository.save(clonedProduct);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
