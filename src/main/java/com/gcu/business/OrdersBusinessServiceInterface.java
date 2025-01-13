package com.gcu.business;


import java.util.List;

import com.gcu.model.OrderModel;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public interface OrdersBusinessServiceInterface {
	public void test();
	public List<OrderModel> getOrders();
	
	@PostConstruct 
	public void init();
	
	@PreDestroy 
	public void destroy();
		
	
}
