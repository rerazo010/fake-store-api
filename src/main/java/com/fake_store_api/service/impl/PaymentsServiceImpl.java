package com.fake_store_api.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.fake_store_api.dtos.OrderDTO;
import com.fake_store_api.dtos.PaymentDTO;
import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.entity.Order;
import com.fake_store_api.repository.OrderRepository;
import com.fake_store_api.service.PaymentsService;
import com.fake_store_api.util.ResponseFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PaymentsServiceImpl implements PaymentsService {

	@Autowired
	OrderRepository orderRepository;

	private static ObjectMapper mapper = new ObjectMapper();
	private static final Logger log = LoggerFactory.getLogger(PaymentsServiceImpl.class);

	@Override
	public ResponseEntity<ResponseDTO> payOrder(Long userId, Long orderId) {
		Double totalPay = null;
		Long totalItems = null;
		Order order = null;
		try {
			// Simulation of obtaining data from the database
			order = orderRepository.getOrder(userId, orderId);

			// transfer data to DTO
			OrderDTO orderDTO = mapper.convertValue(order, OrderDTO.class);

			// obtain the total amount to be paid
			totalPay = orderDTO.getOrderDetail().stream().mapToDouble(od -> od.getTotalPrice()).sum();
			totalItems = orderDTO.getOrderDetail().stream().mapToLong(od -> od.getQuantity()).sum();

		} catch (Exception e) {
			if (order == null) {
				throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No order data found");
			} else {
				log.error("An exception occurred when trying to pay the order", e);
				throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An internal error occurred");
			}
			
		}
		return ResponseFactory.responseOk(new PaymentDTO(userId, orderId, totalItems, totalPay));
	}

}
