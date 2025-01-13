package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrderDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface {

	@Autowired
	private OrderDataService service; 
	
	@Override
	public void test() {
		System.out.println("Soran, hello from the OrdersBusinessService");
		
	}
	
	@Override
	public List<OrderModel> getOrders(){
		
		//Get all the entity orders
		List<OrderEntity> orders = service.findAll();
		
		//Iterate over the entity orders and create a list of domain orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : orders) {
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(),
					entity.getPrice(), entity.getQuantity()));
		}
		
		//return list of domain orders
		return ordersDomain;
	}
	
	@Override
	public void init() {
		System.out.println("This is init method from order business");
	}
	
	@Override
	public void destroy() {
		System.out.println("This is destroy method from order business");
	}
	

}
