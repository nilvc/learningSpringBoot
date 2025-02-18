package com.example.springdataJPA.controllers;

import com.example.springdataJPA.entities.Product;
import com.example.springdataJPA.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    ProductRepository repository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class);

    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return repository.findAll();
    }

    @GetMapping("/products/{id}")
    @Transactional
    @Cacheable("product-cache")
    public Product getAllProducts(@PathVariable Long id)
    {
        LOGGER.info("Finding product by id - "+id);
        return repository.findById(id).get();
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product)
    {
        return repository.save(product);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product)
    {
        return repository.save(product);
    }

    @DeleteMapping("/products/{id}")
    @CacheEvict("product-cache")
    public void deleteProducts(@PathVariable Long id)
    {
        repository.deleteById(id);
    }


}
