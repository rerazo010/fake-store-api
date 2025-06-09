package com.fake_store_api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fake_store_api.dtos.CartsDTO;
import com.fake_store_api.dtos.ProductsDTO;

import com.fake_store_api.client.fallback.ProductsClientFallback;

@FeignClient(name = "${component.fakestore.name}",url = "${component.fakestore.url}", fallbackFactory = ProductsClientFallback.class)
public interface FakeStoreClient {

	//Products endpoints
	
	@GetMapping(value = "/products")
	List<ProductsDTO> getAllProducts();
	
	@PostMapping(value = "/products")
	ProductsDTO createProduct(@RequestBody ProductsDTO productDTO);
	
	@GetMapping(value = "/products/{id}")
	ProductsDTO getProduct(@PathVariable("id") Long id);
	
	@PutMapping(value = "/products/{id}")
	ProductsDTO updateProduct(@PathVariable("id") Long id,@RequestBody ProductsDTO productDTO);
	
	@DeleteMapping(value = "/products/{id}")
	ProductsDTO deleteProduct(@PathVariable("id") Long id);
	
	//Carts endpoints
	
	@GetMapping(value = "/carts")
	List<CartsDTO> getAllCarts();
	
	@PostMapping(value = "/carts")
	CartsDTO createCart(@RequestBody CartsDTO cartDTO);
	
	@GetMapping(value = "/carts/{id}")
	CartsDTO getCart(@PathVariable("id") Long id);
	
	@PutMapping(value = "/carts/{id}")
	CartsDTO updateCart(@PathVariable("id") Long id,@RequestBody CartsDTO cartDTO);
	
	@DeleteMapping(value = "/carts/{id}")
	CartsDTO deleteCart(@PathVariable("id") Long id);

}
