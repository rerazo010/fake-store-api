package com.fake_store_api.service;

import org.springframework.http.ResponseEntity;
import com.fake_store_api.dtos.ProductsDTO;
import com.fake_store_api.dtos.ResponseDTO;

public interface ProductsService {

	public ResponseEntity<ResponseDTO> getAllProducts();

	public ResponseEntity<ResponseDTO> createProduct(ProductsDTO productDTO);

	public ResponseEntity<ResponseDTO> getProduct(Long id);

	public ResponseEntity<ResponseDTO> updateProduct(Long id, ProductsDTO productDTO);

	public ResponseEntity<ResponseDTO> deleteProduct(Long id);

}
