package com.example.demo.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Order;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDaoTest {
	@Autowired
	private OrderDao dao;
	
	@Test
	public void testInsert() {
		Order order = new Order();
		order.setOrderId(6);
		order.setUserEmail("test2@naver.com");
		order.setOrderPayMethod("신용카드");
		dao.insert(order);
	}

	@Test	
	public void testUpdate() {
		Order order = dao.findOne(1);
		order.setOrderPayMethod("계좌이체");
		dao.update(order);
		System.out.println(dao.findOne(1));
	}

	@Test
	public void testDelete() {
		dao.delete(1);
		testFindAll();
	}

	@Test
	public void testFindAll() {
		dao.findAll().forEach(System.out::println);
	}

	@Test
	public void testCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOne() {
		System.out.println(dao.findOne(1));
		
	}

}
