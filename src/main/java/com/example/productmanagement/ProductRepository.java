package com.example.productmanagement;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository  extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long id);
}
