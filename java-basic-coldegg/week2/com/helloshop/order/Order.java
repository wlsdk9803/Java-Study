package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {

    User user; //com.helloshop.user
    Product product;

    public Order(User user, Product product) {
        this.user = user; //이 클래스의 인스턴스를 생성시, 다른 패키지를 import하여 해당 클래스의 속성을 가져올 수 있음
        this.product = product;
    }

}
