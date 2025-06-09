package com.fake_store_api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.repository.OrderRepository;
import com.fake_store_api.service.PaymentsService;
import com.fake_store_api.util.ResponseFactory;

@Service
public class PaymentsServiceImpl implements PaymentsService {
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public ResponseEntity<ResponseDTO> payOrder(Long userId, Long cartId) {
//		ResponseDTO response = new ResponseDTO();
//		
//		response.setMessage("Successfully payment");
		orderRepository.getOrder(userId, cartId);
		return ResponseFactory.responseOk();
	}
	

}
