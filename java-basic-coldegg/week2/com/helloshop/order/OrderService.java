package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {

    //기능(메소드)추가
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
        //비회원 모모씨가 제작 상품을 주문 > user와 product 클래스 설계에 맞는 값을 생성하고, 그 값을 바탕으로 order 정보 저장
    }

}
