package com.fake_store_api.entity;

/**
 * This class is only for simulation to connect to the database.
 */

//@Entity
//@Table(name = "order_detail")
public class OrderDetail {

	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Column(name="detail_id")
	private Long detailId;

	// @ManyToOne(fetch = FetchType.LAZY, optional = false)
	// @JoinColumn(name = "order_id", nullable = false)
	private Order order;

	// @Column(name="product_id")
	private Long productId;

	// @Column(name="quantity")
	private Long quantity;

	// @Column(name="total_price")
	private Float totalPrice;

	public OrderDetail() {
		super();
	}

	public OrderDetail(Long detailId, Long productId, Long quantity, Float totalPrice) {
		super();
		this.detailId = detailId;
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderDetail [detailId=" + detailId + ", productId=" + productId + ", quantity="
				+ quantity + ", totalPrice=" + totalPrice + "]";
	}

}
