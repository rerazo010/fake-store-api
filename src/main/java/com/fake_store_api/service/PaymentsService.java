package com.fake_store_api.service;

import org.springframework.http.ResponseEntity;

import com.fake_store_api.dtos.ResponseDTO;

public interface PaymentsService {
	
	public ResponseEntity<ResponseDTO>payOrder(Long userId, Long cartId);

}
