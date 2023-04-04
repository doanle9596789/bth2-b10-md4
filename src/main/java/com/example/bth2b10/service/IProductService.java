package com.example.bth2b10.service;

import com.example.bth2b10.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}