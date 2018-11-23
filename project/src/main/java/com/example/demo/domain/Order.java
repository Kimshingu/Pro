package com.example.demo.domain;

import lombok.Data;

@Data
public class Order {
	private int orderId;
	private String userEmail;
	private String orderPayMethod;
}
