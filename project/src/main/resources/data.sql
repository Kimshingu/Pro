insert into users(user_email, user_pw, user_name, user_phone, user_address) values('test1@naver.com',  '1234',  '가길동', '01011111111', '1. 우리집에 가고싶다');
insert into users(user_email, user_pw, user_name, user_phone, user_address) values('test2@naver.com',  '1234',  '나길동', '01022222222', '2. 언제 디비설계 끝나냐');
insert into users(user_email, user_pw, user_name, user_phone, user_address) values('test3@naver.com',  '1234',  '다길동', '01033333333', '3. 복합키 어렵다 ㅠㅠ');
insert into users(user_email, user_pw, user_name, user_phone, user_address) values('test4@naver.com',  '1234',  '라길동', '01044444444', '4. 이제 8시다');
insert into users(user_email, user_pw, user_name, user_phone, user_address) values('test5@naver.com',  '1234',  '마길동', '01055555555', '5. 갈시간 다됐네');

insert into product(product_id, product_name, product_price, product_delivery_charge, product_seller, product_courier) values(1,  '나이키1',  10000, 0, '판매자1', '택배사1');
insert into product(product_id, product_name, product_price, product_delivery_charge, product_seller, product_courier) values(2,  '나이키2',  20000, 0, '판매자2', '택배사2');
insert into product(product_id, product_name, product_price, product_delivery_charge, product_seller, product_courier) values(3,  '나이키3',  30000, 0, '판매자3', '택배사3');
insert into product(product_id, product_name, product_price, product_delivery_charge, product_seller, product_courier) values(4,  '나이키4',  40000, 0, '판매자4', '택배사4');
insert into product(product_id, product_name, product_price, product_delivery_charge, product_seller, product_courier) values(5,  '나이키5',  50000, 0, '판매자5', '택배사5');

insert into orders(order_id, user_email, order_pay_method) values (1, 'test1@naver.com', '신용카드');
insert into orders(order_id, user_email, order_pay_method) values (2, 'test1@naver.com', '무통장 입금');
insert into orders(order_id, user_email, order_pay_method) values (3, 'test1@naver.com', '휴대폰 결제');
insert into orders(order_id, user_email, order_pay_method) values (4, 'test4@naver.com', '신용카드');
insert into orders(order_id, user_email, order_pay_method) values (5, 'test5@naver.com', '실시간 계좌이체');

insert into order_detail(order_id, user_email, product_id, order_detail_size, order_detail_color, order_detail_count) values(1, 'test1@naver.com', 1, 'L', 'Black', 1);
insert into order_detail(order_id, user_email, product_id, order_detail_size, order_detail_color, order_detail_count) values(2, 'test1@naver.com', 1, 'L', 'White', 1);
insert into order_detail(order_id, user_email, product_id, order_detail_size, order_detail_color, order_detail_count) values(3, 'test1@naver.com', 1, 'M', 'Black', 2);
insert into order_detail(order_id, user_email, product_id, order_detail_size, order_detail_color, order_detail_count) values(4, 'test4@naver.com', 4, 'M', 'Blue', 2);
insert into order_detail(order_id, user_email, product_id, order_detail_size, order_detail_color, order_detail_count) values(5, 'test5@naver.com', 5, 'S', 'Grey', 2);

insert into cart(user_email, product_id, cart_size, cart_color, cart_count) values('test2@naver.com', 2,'L', 'Black', 1);
insert into cart(user_email, product_id, cart_size, cart_color, cart_count) values('test2@naver.com', 2,'L', 'Red', 1);
insert into cart(user_email, product_id, cart_size, cart_color, cart_count) values('test2@naver.com', 2,'M', 'Black', 1);
insert into cart(user_email, product_id, cart_size, cart_color, cart_count) values('test3@naver.com', 3,'S', 'Pink', 1);
insert into cart(user_email, product_id, cart_size, cart_color, cart_count) values('test3@naver.com', 3,'L', 'Pink', 1);