package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Product;

@Mapper
public interface ProductDao {
	public int insert(Product product);
	public int update(Product product);
	public int delete(int productId);
	
	public List<Product> findAll();
	public int count();
	public Product findOne(int productId);
}
