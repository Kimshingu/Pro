package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.OrderDetail;

@Mapper
public interface OrderDetailDao {
	public int insert(OrderDetail orderDetail);
	public int update(OrderDetail orderDetail);
	public int delete
			(@Param("orderId")int orderId, @Param("userEmail")String userEmail, @Param("productId")int productId, 
			 @Param("orderDetailSize")String orderDetailSize, @Param("orderDetailColor")String orderDetailColor);
	public List<OrderDetail> findAll();
	public int count();
	public OrderDetail findOne
			(@Param("orderId")int orderId, @Param("userEmail")String userEmail, @Param("productId")int productId, 
			 @Param("orderDetailSize")String orderDetailSize, @Param("orderDetailColor")String orderDetailColor);
}
