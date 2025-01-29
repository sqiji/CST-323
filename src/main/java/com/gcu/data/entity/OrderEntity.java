package com.gcu.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("ORDERS")
public class OrderEntity {
	
	@Id
	@Column("ID")
	private long id;
	
	@Column("ORDER_NO")
	private String orderNo;
	
	@Column("PRODUCT_NAME")
	private String productName;
	
	@Column("PRICE")
	private float price;
	
	@Column("QUANTITY")
	private int quantity;
	
	
//	public OrderEntity() {
//		super();
//	}
	
	/**
	 * Non default constructor
	 * @param id 
	 * @param orderNo
	 * @param productName
	 * @param price
	 * @param quantity
	 */
	public OrderEntity(long id, String orderNo, String productName, float price, int quantity) {
		super();
		this.id = id;
		this.orderNo = orderNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	/**
	 * method that return the ID
	 * @return  id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * method that set the ID
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * method that return the OrderNo
	 * @return  orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}
	
	/**
	 * method that set the OrderNo
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	/**
	 * method that return the ProductName
	 * @return  productName
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * method that set the ProductName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * method that return the Price
	 * @return  price
	 */
	public float getPrice() {
		return price;
	}
	
	/**
	 * method that set the Price
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	/**
	 * method that return the Quantity
	 * @return  quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * method that set the Quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
