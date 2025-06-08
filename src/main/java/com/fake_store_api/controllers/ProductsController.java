package com.fake_store_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fake_store_api.dtos.ProductsDTO;
import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	ProductsService productsService;

	@GetMapping(value = "/all")
	public ResponseEntity<ResponseDTO> getAllProducts() {
		return productsService.getAllProducts();
	}
	
	@PostMapping(value = "/create")
	public ResponseEntity<ResponseDTO> creteProduct(@RequestBody ProductsDTO productDTO) {
		return productsService.createProduct(productDTO);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseDTO> getProduct(@PathVariable("id") Long id) {
		return productsService.getProduct(id);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseDTO> updateProduct(@PathVariable("id") Long id,@RequestBody ProductsDTO productDTO) {
		return productsService.updateProduct(id,productDTO);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseDTO> deleteProduct(@PathVariable("id") Long id) {
		return productsService.deleteProduct(id);
	}

}
