package com.fake_store_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fake_store_api.dtos.ClientDTO;
import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.dtos.SecurityDTO;
import com.fake_store_api.service.SecurityService;

@RestController
@RequestMapping("/security")
public class SecurityController {

	@Autowired
	SecurityService securityService;

	@PostMapping(value = "/authentication")
	public ResponseEntity<ResponseDTO> authentication(@RequestBody ClientDTO clientDTO) {
		return securityService.authentication(clientDTO);
	}

	@PostMapping(value = "/authorization")
	public ResponseEntity<ResponseDTO> authorization(@RequestBody SecurityDTO securityDTO) {
		return securityService.authorization(securityDTO);
	}

}
