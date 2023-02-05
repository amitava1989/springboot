package com.poc.azurems.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.azurems.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
