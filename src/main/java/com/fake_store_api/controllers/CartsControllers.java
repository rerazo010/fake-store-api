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

import com.fake_store_api.dtos.CartsDTO;
import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.service.CartsService;

@RestController
@RequestMapping("/carts")
public class CartsControllers {
	
	@Autowired
	CartsService cartsService;
	

	@GetMapping(value = "/all")
	public ResponseEntity<ResponseDTO> getAllCarts() {
		return cartsService.getAllCarts();
	}
	
	@PostMapping(value = "/create")
	public ResponseEntity<ResponseDTO> creteCart(@RequestBody CartsDTO CartDTO) {
		return cartsService.createCart(CartDTO);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseDTO> getCart(@PathVariable("id") Long id) {
		return cartsService.getCart(id);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseDTO> updateCart(@PathVariable("id") Long id,@RequestBody CartsDTO CartDTO) {
		return cartsService.updateCart(id,CartDTO);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseDTO> deleteCart(@PathVariable("id") Long id) {
		return cartsService.deleteCart(id);
	}


}
