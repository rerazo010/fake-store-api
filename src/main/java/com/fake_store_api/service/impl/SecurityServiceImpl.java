package com.fake_store_api.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.fake_store_api.dtos.ClientDTO;
import com.fake_store_api.dtos.ResponseDTO;
import com.fake_store_api.dtos.SecurityDTO;
import com.fake_store_api.service.SecurityService;
import com.fake_store_api.util.ResponseFactory;

/**
 * This class is only for mock security testing with static data. For real
 * security, is needed to use Spring Security and validate the data against the
 * database.
 * 
 * @author Ronald Erazo
 */

@Service
public class SecurityServiceImpl implements SecurityService {
	private static final Logger log = LoggerFactory.getLogger(SecurityServiceImpl.class);

	@Override
	public ResponseEntity<ResponseDTO> authentication(ClientDTO clientDTO) {
		try {
			if (!clientDTO.getUsername().equalsIgnoreCase("eronald01")
					|| !clientDTO.getPassword().equalsIgnoreCase("123456")) {

				throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Username or password not recognized");

			}

		} catch (ResponseStatusException e) {
			if (e.getStatus() == HttpStatus.UNAUTHORIZED) {
				throw e;
			}
		} catch (Exception e) {
			log.error("An exception occurred when trying to autentication", e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An internal error occurred");

		}

		return ResponseFactory.responseOk(new SecurityDTO("eronald01", "vJ3URSEcHM5kxh9LVD0gSlfbva2vh8IM"));
	}

	@Override
	public ResponseEntity<ResponseDTO> authorization(SecurityDTO securityDTO) {
		try {
			if (!securityDTO.getUsername().equalsIgnoreCase("eronald01")
					|| !securityDTO.getToken().equalsIgnoreCase("vJ3URSEcHM5kxh9LVD0gSlfbva2vh8IM")) {

				throw new ResponseStatusException(HttpStatus.FORBIDDEN, "does not have permissions");

			}

		} catch (ResponseStatusException e) {
			if (e.getStatus() == HttpStatus.FORBIDDEN) {
				throw e;
			}
		} catch (Exception e) {
			log.error("An exception occurred when trying to autentication", e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An internal error occurred");

		}

		return ResponseFactory.responseOk(new SecurityDTO("eronald01", "vJ3URSEcHM5kxh9LVD0gSlfbva2vh8IM"));
	}

}
