package com.fake_store_api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.fake_store_api.dtos.ProductsDTO;

import com.fake_store_api.client.fallback.ProductsClientFallback;

@FeignClient(name = "${component.fakestore.name}",url = "${component.fakestore.url}", fallbackFactory = ProductsClientFallback.class)
public interface ProductsClient {

	@GetMapping(value = "/products")
	List<ProductsDTO> getAllProducts();
}
