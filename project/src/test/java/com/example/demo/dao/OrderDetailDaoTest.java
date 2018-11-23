package com.example.demo.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.OrderDetail;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {
	
	@Autowired
	private OrderDetailDao dao;
	@Test
	public void testInsert() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setOrderId(1);
		orderDetail.setUserEmail("test1@naver.com");
		orderDetail.setProductId(3);
		orderDetail.setOrderDetailSize("날 쏘고 가라");
		orderDetail.setOrderDetailColor("안성기");
		orderDetail.setOrderDetailCount(3);
		
		dao.insert(orderDetail);
		testFindAll();
	}

	@Test
	public void testUpdate() {
		OrderDetail orderDetail = dao.findOne(1, "test1@naver.com", 1, "L", "Black");
		orderDetail.setOrderDetailCount(5);
//		orderDetail.setOrderDetailSize("M");
		dao.update(orderDetail);
		testFindAll();
			
	}

	@Test
	public void testDelete() {
		dao.delete(1, "test1@naver.com", 1, "L", "Black");
		testFindAll();
	}

	@Test
	public void testFindAll() {
		dao.findAll().forEach(System.out::println);
	}

	@Test
	public void testCount() {
		System.out.println(dao.count());
		
	}

	@Test
	public void testFindOne() {
		
	}

}
