package com.example.factorymethodproduct.service;

import com.example.factorymethodproduct.model.ProductEntity;
import com.example.factorymethodproduct.repository.ProductRepository;
import com.example.factorymethodproduct.factory.ProductFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author Abdul Moiz Meer
 */
@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductFactory productFactory;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductFactory productFactory) {
        this.productRepository = productRepository;
        this.productFactory = productFactory;
    }

    public ProductEntity createProduct(String type, String name, double price) {
        ProductEntity product = productFactory.createProduct(type, name, price);
        return productRepository.save(product);
    }

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
}
