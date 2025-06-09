package com.fake_store_api.dtos;

import java.util.List;

public class OrderDTO {

	private Long orderId;

	private Long userId;

	private List<OrderDetailDTO> orderDetail;

	public OrderDTO() {
		super();

	}

	public OrderDTO(Long orderId, Long userId, List<OrderDetailDTO> orderDetail) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.orderDetail = orderDetail;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<OrderDetailDTO> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetailDTO> orderDetail) {
		this.orderDetail = orderDetail;
	}

}
