package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.OrdersRestService;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

import jakarta.validation.Valid;


@Controller

public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired 
	private OrdersBusinessServiceInterface service;
	
	@Autowired 
	private SecurityBusinessService security; 
	
	@GetMapping("/")
	public String display(Model model) {
		logger.trace("==========> In display() to display login page");
		LoginModel loginModel = new LoginModel();
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", loginModel);
		return "login";
	}
	
	/*
	@GetMapping("/")
	public String getIndex()
	{
		return "Index";
	}
	*/
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		logger.trace("==========> In doLogin()");
		//print the form values
		//System.out.println(String.format("Form with username of %s and password of %s", loginModel.getUsername(), loginModel.getPassword()));
		//check for validation
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			
			return "login";
			
		}
		//Navigate back to login view
		//return "login";

		service.test();
		security.authenticate(loginModel.getUsername(), loginModel.getPassword());
		//security.authenticate(getIndex(), getIndex());
		
		//Create some order using List
		List<OrderModel> orders = service.getOrders();
		
		logger.trace("==========> Displaying the products list");
		
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		
		
		return "orders";
	}
}

