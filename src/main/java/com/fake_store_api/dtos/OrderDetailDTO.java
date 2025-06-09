package com.fake_store_api.dtos;

public class OrderDetailDTO {

	private Long detailId;

	private Long orderId;

	private Long productId;

	private Long quantity;

	private Float totalPrice;

	public OrderDetailDTO() {
		super();
	}

	public OrderDetailDTO(Long detailId, Long orderId, Long productId, Long quantity, Float totalPrice) {
		super();
		this.detailId = detailId;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public Long getDetailId() {
		return detailId;
	}

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
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

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "OrderDetailDTO [detailId=" + detailId + ", orderId=" + orderId + ", productId=" + productId
				+ ", quantity=" + quantity + ", totalPrice=" + totalPrice + "]";
	}

}
