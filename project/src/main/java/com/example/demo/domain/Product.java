package com.example.demo.domain;

import lombok.Data;

@Data
public class Product {
	private int productId;
	private String productImg;
	private String productName;
	private int productPrice;
	private int productDeliveryCharge;
	private String productSeller;
	private String productCourier;
}
