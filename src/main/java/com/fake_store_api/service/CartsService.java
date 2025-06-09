package com.fake_store_api.service;

import org.springframework.http.ResponseEntity;

import com.fake_store_api.dtos.CartsDTO;
import com.fake_store_api.dtos.ResponseDTO;

public interface CartsService {

	public ResponseEntity<ResponseDTO> getAllCarts();

	public ResponseEntity<ResponseDTO> createCart(CartsDTO CartDTO);

	public ResponseEntity<ResponseDTO> getCart(Long id);

	public ResponseEntity<ResponseDTO> updateCart(Long id, CartsDTO CartDTO);

	public ResponseEntity<ResponseDTO> deleteCart(Long id);
}
