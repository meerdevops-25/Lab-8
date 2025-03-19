package com.example.factorymethodproduct.controller;

import com.example.factorymethodproduct.model.ProductEntity;
import com.example.factorymethodproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author Abdul Moiz Meer
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ProductEntity createProduct(@RequestParam String type,
                                       @RequestParam String name,
                                       @RequestParam double price) {
        return productService.createProduct(type, name, price);
    }

    @GetMapping("/all")
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }
}
