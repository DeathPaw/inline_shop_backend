package com.example.springboottutorial.repository;

import com.example.springboottutorial.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepo extends JpaRepository<Product, UUID> {
    boolean existsByName(String name);

    Optional<Product> findByName(String name);
}