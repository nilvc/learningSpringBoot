package com.example.springdataJPA.repository;

import com.example.springdataJPA.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
