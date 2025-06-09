package com.fake_store_api.dtos;

import java.util.Date;
import java.util.List;

import com.fake_store_api.util.ResponseMessage;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CartsDTO {

	@JsonProperty(value = "id")
	private Long id;

	@JsonProperty(value = "userId")
	private Long userId;
	
	@JsonProperty(value = "date")
	@JsonFormat(timezone = ResponseMessage.TIMEZONE)
	private Date date;

	@JsonProperty(value = "products")
	private List<CartDetailDTO> products;

	
}
