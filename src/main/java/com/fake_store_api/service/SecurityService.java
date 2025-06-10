package com.fake_store_api.service;

import org.springframework.http.ResponseEntity;

import com.fake_store_api.dtos.ClientDTO;
import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.dtos.SecurityDTO;

public interface SecurityService {

	public ResponseEntity<ResponseDTO> authentication(ClientDTO clientDTO);

	public ResponseEntity<ResponseDTO> authorization(SecurityDTO securityDTO);

}
