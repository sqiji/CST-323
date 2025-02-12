package com.gcu.data;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;
import com.gcu.model.OrderModel;
 
@Service
public class OrderDataService implements DataAccessInterface<OrderEntity> {

	@Autowired
	private OrdersRepository orderRepository;
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;
	
	/**
	 * Nod default constructor for constructor injection
	 * @param orderRepository
	 */
	public OrderDataService(OrdersRepository orderRepository, DataSource dataSource) {
		this.orderRepository = orderRepository;
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	@Override
	public OrderEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<OrderEntity> findAll() {
		
		String sql = "SELECT * FROM ORDERS";
		List<OrderEntity> orders = new ArrayList<OrderEntity>();
		
		try {
			Iterable<OrderEntity> orderIterable = orderRepository.findAll();
			
			//converting to List and calling the list
			orders = new ArrayList<OrderEntity>(); 
			orderIterable.forEach(orders::add);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		//return order list
 		return orders;
	}

	@Override
	public boolean create(OrderEntity order) {
		//Example of Overriding the CrudRepository save() because it simply
		// is never called. It can inject a dataSource and use the jdbcTemplate to
		//provide a customized implementation of a save() method
		String sql = "INSERT INTO ORDERS(ORDER_NO, PRODUCT_NAME, PRICE,"
				+ "QUANTITY) VALUES(?,?,?,?)";
		try {
			jdbcTemplateObject.update(sql,
										order.getOrderNo(),
										order.getProductName(),
										order.getPrice(),
										order.getQuantity());
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}


}
