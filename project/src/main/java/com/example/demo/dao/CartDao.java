package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.Cart;

@Mapper
public interface CartDao {
	public int insert(Cart cart);
	public int update(Cart cart);
	public int delete(@Param("userEmail")String userEmail, @Param("productId")int productId, 
					  @Param("cartSize")String cartSize, @Param("cartColor")String cartColor);
	
	public List<Cart> findAll();
	public int count();
	public Cart findOne(@Param("userEmail")String userEmail, @Param("productId")int productId, 
						@Param("cartSize")String cartSize, @Param("cartColor")String cartColor);
}
