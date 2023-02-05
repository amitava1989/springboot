package com.poc.azurems.controller;

import org.springframework.web.bind.annotation.RestController;

import com.poc.azurems.model.Product;
import com.poc.azurems.repo.ProductRepo;

@RestController
public class ProductController {

	private  ProductRepo repo;
	public   Product saveProduct(Product prod) {
		return repo.save(prod);
		
	}
}
