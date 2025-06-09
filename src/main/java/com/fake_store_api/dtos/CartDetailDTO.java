package com.fake_store_api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartDetailDTO {

	@JsonProperty(value = "productId")
	private Long productId;

	@JsonProperty(value = "quantity")
	private Long quantity;

	public CartDetailDTO(Long productId, Long quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}

	public CartDetailDTO() {
		super();
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
