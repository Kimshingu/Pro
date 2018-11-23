package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Order;
@Mapper
public interface OrderDao {
	public int insert(Order order);
	public int update(Order order);
	public int delete(int orderId);
	
	public List<Order> findAll();
	public int count();
	public Order findOne(int orderId);
}
