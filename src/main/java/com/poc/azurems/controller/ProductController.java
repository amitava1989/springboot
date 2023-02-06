package com.poc.azurems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.azurems.model.Product;
import com.poc.azurems.repo.ProductRepo;

@SpringBootApplication
@RestController
public class ProductController {
	@Autowired
	private  ProductRepo repo;
	@PostMapping("/product")
	public   Product saveProduct(@RequestBody Product prod) {
		return repo.save(prod);
		
	}
	
	@GetMapping("/products")
	public List<Product>   findAll() {
		return repo.findAll();
		
	}
}
