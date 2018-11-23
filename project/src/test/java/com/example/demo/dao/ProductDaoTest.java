package com.example.demo.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDaoTest {
	@Autowired
	private ProductDao dao;
	
	@Test
	public void testInsert() {
		Product product = new Product();
		product.setProductId(6);
		product.setProductName("나이키6");
		product.setProductPrice(60000);
		product.setProductDeliveryCharge(0);
		product.setProductSeller("판매자6");
		product.setProductCourier("택배사6");
		
		dao.insert(product);
		testFindAll();
	}

	@Test
	public void testUpdate() {
		
		Product product = new Product();
		product.setProductId(6);
		product.setProductName("나이키6");
		product.setProductPrice(60000);
		product.setProductDeliveryCharge(0);
		product.setProductSeller("판매자6");
		product.setProductCourier("택배사6");
		dao.insert(product);
		
		// id를 변경할 수 없도록 코드를 작성해야 한다.
		product.setProductId(5);
		product.setProductName("변경된 나이키");
		dao.update(product);
		testFindAll();
	}

	@Test
	public void testDelete() {
		// (미구현)
		dao.delete(5);
		testFindAll();
	}

	@Test
	public void testFindAll() {
		if (dao != null) {
			List<Product> products = dao.findAll();
			
			System.out.println(products);
//			products.forEach(System.out::println);
		} else {
			System.out.println("dao is null! you know!");
		}
	}

	@Test
	public void testCount() {
		System.out.println(dao.count());
	}

	@Test
	public void testFindOne() {
		Product product =dao.findOne(1);
		System.out.println(product);
	}
}
