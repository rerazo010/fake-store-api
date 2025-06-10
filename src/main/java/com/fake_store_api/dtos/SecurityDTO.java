package com.fake_store_api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurityDTO {

	@JsonProperty(value = "username")
	private String username;

	@JsonProperty(value = "token")
	private String token;

	public SecurityDTO() {
		super();
	}

	public SecurityDTO(String username, String token) {
		super();
		this.username = username;
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
