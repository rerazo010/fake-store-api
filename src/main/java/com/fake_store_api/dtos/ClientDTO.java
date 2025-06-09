package com.fake_store_api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientDTO {
	
	@JsonProperty(value = "id")
	private Long id;
	
	@JsonProperty(value = "firstname")
	private String firstname;
	
	@JsonProperty(value = "lastname")
	private String lastname;
	
	@JsonProperty(value = "email")
	private String email;
	
	@JsonProperty(value = "phone")
	private String phone;
	
	@JsonProperty(value = "username")
	private String username;
	
	@JsonProperty(value = "password")
	private String password;

}
