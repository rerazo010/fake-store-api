package com.fake_store_api.dtos;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientDTO {

	@JsonProperty(value = "username")
	@NotBlank(message = "The username is required")
	private String username;

	@JsonProperty(value = "password")
	@NotBlank(message = "The password is required")
	private String password;

	public ClientDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public ClientDTO() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
