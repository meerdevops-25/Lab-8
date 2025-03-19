package com.example.prototypepattern.controller;

import com.example.prototypepattern.model.Product;
import com.example.prototypepattern.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * @author Abdul Moiz Meer
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // API to create a new product
    @PostMapping("/create")
    public Product createProduct(@RequestParam String name,
                                 @RequestParam String category,
                                 @RequestParam double price,
                                 @RequestParam String color) {
        return productService.createProduct(name, category, price, color);
    }

    // API to clone a product with a new color
    @PostMapping("/clone/{id}")
    public Product cloneProduct(@PathVariable Long id, @RequestParam String newColor) {
        return productService.cloneProduct(id, newColor);
    }
}
