package com.order.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.order.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {
	
	// fake order list
	List<Order> list = List.of(new Order(1,"Order 1","Address 1",11),
			new Order(2,"Order 2","Address 2",12),
			new Order(3,"Order 3","Address 3",13),
			new Order(4,"Order 4","Address 4",13)
			);

	@Override
	public List<Order> getOrderOfProduct(int pId) {
		return list.stream().filter(order -> order.getpId() == pId).collect(Collectors.toList());
	}

}
