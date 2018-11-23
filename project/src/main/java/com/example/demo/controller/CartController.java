package com.example.demo.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CartDao;
import com.example.demo.domain.Cart;

@Controller
@RequestMapping("/test")
public class CartController {

	@Autowired
	private CartDao dao;
	
	@GetMapping
	public String getSearchView(Model model) {
		
		List<Cart> cart = dao.findAll();
		System.out.println(cart);
		model.addAttribute("Products", cart);
		
		return "cartTest";
	}
	

	
}
