package com.fake_store_api.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fake_store_api.client.ProductsClient;
import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.service.ProductsService;
import com.fake_store_api.util.ResponseFactory;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	ProductsClient productsClient;

	@Override
	public ResponseEntity<ResponseDTO> getAllProducts() {
		return ResponseFactory.responseOk(productsClient.getAllProducts());
	}

}
