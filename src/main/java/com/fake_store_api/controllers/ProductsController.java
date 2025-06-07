package com.fake_store_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	ProductsService productsService;

	@GetMapping(value = "all")
	public ResponseEntity<ResponseDTO> getAllProducts() {
		return productsService.getAllProducts();
	}

}
