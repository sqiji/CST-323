package com.gcu.model;

public class OrderModel {

	private long id;
	private String orderNo;
	private String productName;
	private float price;
	private int quantity;
	
	
	/**
	 * Constructor that initialize all class variables 
	 * @param id      			The unique value of record
	 * @param orderNo  			The order number
	 * @param productName       The product name
	 * @param price				Product price
	 * @param quantity			Product quantity
	 */
	
	public OrderModel(long id, String orderNo, String productName, float price, int quantity) {
		this.id = id;
		this.orderNo = orderNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	//Getter and Setter method for all variables
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
