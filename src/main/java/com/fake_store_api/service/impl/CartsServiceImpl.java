package com.fake_store_api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fake_store_api.client.FakeStoreClient;
import com.fake_store_api.dtos.CartsDTO;
import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.service.CartsService;
import com.fake_store_api.util.ResponseFactory;

@Service
public class CartsServiceImpl implements CartsService {
	
	@Autowired
	FakeStoreClient fakeStoreClient;

	@Override
	public ResponseEntity<ResponseDTO> getAllCarts() {
		return  ResponseFactory.responseOk(fakeStoreClient.getAllCarts());
	}

	@Override
	public ResponseEntity<ResponseDTO> createCart(CartsDTO CartDTO) {
		return ResponseFactory.responseOk(fakeStoreClient.createCart(CartDTO));
	}

	@Override
	public ResponseEntity<ResponseDTO> getCart(Long id) {
		return ResponseFactory.responseOk(fakeStoreClient.getCart(id));
	}

	@Override
	public ResponseEntity<ResponseDTO> updateCart(Long id, CartsDTO CartDTO) {
		return  ResponseFactory.responseOk(fakeStoreClient.updateCart(id,CartDTO));
	}

	@Override
	public ResponseEntity<ResponseDTO> deleteCart(Long id) {
		return ResponseFactory.responseOk(fakeStoreClient.deleteCart(id));
	}

}
