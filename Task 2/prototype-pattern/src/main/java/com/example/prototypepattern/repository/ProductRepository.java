package com.example.prototypepattern.repository;

import com.example.prototypepattern.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Abdul Moiz Meer
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
