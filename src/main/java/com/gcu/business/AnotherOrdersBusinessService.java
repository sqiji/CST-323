package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {

	@Override
	public void test() {
		System.out.println("Soran, hello from the AnotherOrdersBusinessService");
	}

	@Override
	public List<OrderModel> getOrders(){
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "00001", "Prodect 1", 10.00f, 5));
		orders.add(new OrderModel(1L, "00002", "Prodect 2", 15.00f, 8));
		orders.add(new OrderModel(2L, "00003", "Prodect 3", 12.80f, 20));
		orders.add(new OrderModel(3L, "00004", "Prodect 4", 7.49f, 15));
		
		return orders;
	}
	
	@Override
	public void init() {
		System.out.println("This is init method from Another order business");
	}
	
	@Override
	public void destroy() {
		System.out.println("This is destroy method from Another order business");
	}
}
