package com.example.demo.domain;

import lombok.Data;

@Data
public class OrderDetail {
	private int orderId;
	private String userEmail;
	private int productId;
	private String orderDetailSize;
	private String orderDetailColor;
	private int orderDetailCount;
}
