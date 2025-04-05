package com.gcu.business;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.OrderModel;



@RestController
@RequestMapping("/service") 
public class OrdersRestService {
	
	@Autowired 
	private OrdersBusinessServiceInterface service;
	
	private static final Logger logger = LoggerFactory.getLogger(OrdersRestService.class);
	
	@GetMapping(path="/getjson", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<OrderModel> getOrderAsJson(){
		logger.trace("==========> In getOrdersAsJson() at" + "/getjson");
		return service.getOrders();
	}
	
	@GetMapping(path="/getxml", produces= {MediaType.APPLICATION_ATOM_XML_VALUE})
	public List<OrderModel> getOrderAsXml(){
		logger.trace("==========> In getOrdersAsXML() at" + "/getxml");
		return service.getOrders();
	} 
	
	@GetMapping(value="/orders", produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<OrderModel> getOrders(){
		logger.trace("==========> In getOrders()");
		return service.getOrders();
	} 
	
	
}
