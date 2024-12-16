package enumeration.ex3;

import enumeration.ex2.ClassGrade;

import static enumeration.ex3.Grade.*; //상수는 static import 가능

public class DiscountService {
    //문자를 받는 대신 classGrade라는 타입을 받는다.
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        if(classGrade == BASIC) {
            discountPercent = 10;
        } else if (classGrade == GOLD) {
            discountPercent = 20;
        } else if (classGrade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 x");
        }

        //10000 * (20 / 100) -> 2000원 할인
        return price * discountPercent / 100;
    }
}
