package com.fake_store_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fake_store_api.entity.Order;
import com.fake_store_api.entity.OrderDetail;

/**
 * This class is just to simulate a JPA repository to get request information to
 * the database.
 */
@Service // Create a service just for simulation, the appropriate way is @Repository
public class OrderRepository {

	public Order getOrder(Long userId, Long orderId) {

		if (userId == 1 && orderId == 1) {
			OrderDetail orderDetail1 = new OrderDetail();
			orderDetail1.setDetailId(1L);
			orderDetail1.setProductId(1L);
			orderDetail1.setQuantity(3L);
			orderDetail1.setTotalPrice(10.25f);

			OrderDetail orderDetail2 = new OrderDetail();
			orderDetail2.setDetailId(1L);
			orderDetail2.setProductId(1L);
			orderDetail2.setQuantity(3L);
			orderDetail2.setTotalPrice(10.25f);

			List<OrderDetail> detail = new ArrayList<OrderDetail>();
			detail.add(orderDetail1);
			detail.add(orderDetail2);

			Order order = new Order();
			order.setUserId(userId);
			order.setOrderId(orderId);
			order.setOrderDetail(detail);
			return order;
		}

		return null;
	}

}
