package com.fake_store_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.service.PaymentsService;

@RestController
@RequestMapping("/payments")
public class PaymentsControllers {

	
	@Autowired
	PaymentsService paymentsService;
	
	@PostMapping(value = "/pay")
	public ResponseEntity<ResponseDTO> payOrder(@RequestParam(value = "orderId") Long orderId,
			@RequestParam(value = "userId") Long userId) {
		return paymentsService.payOrder(userId, orderId);
	}

}
