package com.fake_store_api.entity;

import java.util.List;

/**
 * This class is only for simulation to connect to the database.
 */

//@Entity
//@Table(name = "order")
public class Order {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="order_id")
	private Long orderId;

	//@Column(name="user_id")
	private Long userId;

	//@OneToMany(mappedBy = "order",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
	private List<OrderDetail> orderDetail;

	public Order() {
		super();
	}

	public Order(Long orderId, Long userId, List<OrderDetail> orderDetail) {
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

	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", orderDetail=" + orderDetail + "]";
	}

	
}
