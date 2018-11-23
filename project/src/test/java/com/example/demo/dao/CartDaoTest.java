package com.example.demo.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Cart;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartDaoTest {
	
	@Autowired
	private CartDao dao;
	
	@Test
	public void testInsert() {
		Cart cart = new Cart();
		cart.setUserEmail("test2@naver.com");
		cart.setProductId(2);
		cart.setCartSize("S");
		cart.setCartColor("SkyBlue");
		cart.setCartCount(2);
		
		dao.insert(cart);
		testFindAll();
	}

	@Test
	public void testUpdate() {
		
	}

	@Test
	public void testDelete() {
		testFindAll();
		dao.delete("test2@naver.com",2,"L", "Black");
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
		testFindAll();
		Cart cart = dao.findOne("test2@naver.com",2,"L", "Black");
		System.out.println(cart);
	}

}
