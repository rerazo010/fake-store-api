package com.fake_store_api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentDTO {

	@JsonProperty(value = "userId")
	private Long userId;

	@JsonProperty(value = "orderId")
	private Long orderId;

	@JsonProperty(value = "totalItems")
	private Long totalItems;

	@JsonProperty(value = "totalOrder")
	private Double totalOrder;

	public PaymentDTO(Long userId, Long orderId, Long totalItems, Double totalOrder) {
		super();
		this.userId = userId;
		this.orderId = orderId;
		this.totalItems = totalItems;
		this.totalOrder = totalOrder;
	}

	public PaymentDTO() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}

	public Double getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(Double totalOrder) {
		this.totalOrder = totalOrder;
	}

	@Override
	public String toString() {
		return "PaymentDTO [userId=" + userId + ", orderId=" + orderId + ", totalItems=" + totalItems + ", totalOrder="
				+ totalOrder + "]";
	}

}
