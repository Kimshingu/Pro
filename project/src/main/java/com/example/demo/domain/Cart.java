package com.example.demo.domain;

import lombok.Data;

@Data
public class Cart {
	private String userEmail;
	private int productId;
	private String cartSize;
	private String cartColor;
	private int cartCount;
}
