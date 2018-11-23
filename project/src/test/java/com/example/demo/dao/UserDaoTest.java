package com.example.demo.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	@Autowired
	private UserDao dao;
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setUserEmail("test6@naver.com");
		user.setUserName("홍길동");
		user.setUserPhone("01012345678");
		user.setUserPw("1234");
		user.setUserAddress("집에 언제 가냐");
		
		System.out.println(user);
			
	}

	@Test
	public void testUpdate() {
		User user = dao.findOne("test1@naver.com");
		System.out.println(user);
		
		user.setUserName("변경된 사용자 이름");
		
		dao.update(user);
		System.out.println(user);
		
	}

	@Test
	public void testDelete() {
		// Users 테이블의 PK값을 FK로 사용하는 다른 테이블들의 로우를 먼저 삭제한 후에 
		// 다음 메소드를 사용해야 합니다. 
		// (미구현)
		dao.delete("test1@naver.com");
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
		System.out.println(dao.count());
		
		User user = new User();
		user.setUserEmail("test6@naver.com");
		user.setUserName("홍길동");
		user.setUserPhone("01012345678");
		user.setUserPw("1234");
		user.setUserAddress("집에 언제 가냐");
		
		int affected = dao.insert(user);
		System.out.println(affected);
		
		System.out.println(dao.count());
		
		System.out.println(dao.findOne(user.getUserEmail()));
		

	}
}
