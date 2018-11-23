package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.User;

@Mapper
public interface UserDao {
	public int insert(User user);
	public int update(User user);
	public int delete(String userEmail);
	
	public List<User> findAll();
	public int count();
	public User findOne(String userEmail);
}
