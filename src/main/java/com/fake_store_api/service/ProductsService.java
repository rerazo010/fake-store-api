package com.fake_store_api.service;

import org.springframework.http.ResponseEntity;

import com.fake_store_api.dtos.ResponseDTO;

public interface ProductsService {

	ResponseEntity<ResponseDTO> getAllProducts();

}
