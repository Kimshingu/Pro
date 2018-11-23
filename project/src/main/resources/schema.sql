drop table if exists users;
drop table if exists product;
drop table if exists cart;
drop table if exists orders;
drop table if exists order_detail;

CREATE TABLE users (
	user_email VARCHAR(40) NOT NULL primary key,
	user_pw VARCHAR(15) NOT NULL,
	user_name VARCHAR(40) NOT NULL,
	user_phone VARCHAR(20) NOT NULL,
	user_address VARCHAR(100) NOT NULL
);

CREATE TABLE product (
	product_id INT(11) NOT NULL primary key,
	product_img VARCHAR(100) NULL,
	product_name VARCHAR(100) NOT NULL,
	product_price INT(11) NOT NULL,
	product_delivery_charge INT(11) NOT NULL DEFAULT '0',
	product_seller VARCHAR(40) NOT NULL,
	product_courier VARCHAR(40) NOT NULL
);

CREATE TABLE cart (
	user_email VARCHAR(40) NOT NULL,
	product_id int NOT NULL,
	cart_size VARCHAR(10) NULL DEFAULT NULL,
	cart_color VARCHAR(20) NULL DEFAULT NULL,
	cart_count INT(11) NULL DEFAULT '1',
	CONSTRAINT user_email FOREIGN KEY (user_email) REFERENCES users(user_email) ON DELETE CASCADE,
	PRIMARY KEY(user_email, product_id, cart_size, cart_color) 
);

CREATE TABLE orders (
	order_id INT(11) NOT NULL primary key,
	user_email VARCHAR(40) NOT NULL,
	order_pay_method VARCHAR(50) NULL DEFAULT NULL,
	CONSTRAINT order_user FOREIGN KEY (user_email) REFERENCES users(user_email) ON DELETE CASCADE
);

CREATE TABLE order_detail(
	order_id INT(11) NOT NULL ,
	user_email VARCHAR(40) NOT NULL,
	product_id int NOT NULL,
	order_detail_size VARCHAR(10) NULL DEFAULT NULL,
	order_detail_color VARCHAR(20) NULL DEFAULT NULL,
	order_detail_count INT(11) NULL DEFAULT '1',
	CONSTRAINT order_detail_user FOREIGN KEY (user_email) REFERENCES users(user_email) ON DELETE CASCADE,
	CONSTRAINT order_detail_id FOREIGN KEY (order_id) REFERENCES orders(order_id) ON DELETE CASCADE,
	PRIMARY KEY(order_id, user_email, product_id, order_detail_size, order_detail_color) 
);
