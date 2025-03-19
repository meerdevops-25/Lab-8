package com.example.factorymethodproduct.repository;

import com.example.factorymethodproduct.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Abdul Moiz Meer
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
