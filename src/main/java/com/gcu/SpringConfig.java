package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.gcu.business.AnotherOrdersBusinessService;
import com.gcu.business.OrdersBusinessService;
import com.gcu.business.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {

	@Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
	@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
	@RequestScope
	//@SessionScope
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		//Return an instance for OrdersBusinessService
		return new OrdersBusinessService();
		
		//Return an instance for AnotherOrdersBusinessService
		//return new AnotherOrdersBusinessService();
		
		
	}
}
