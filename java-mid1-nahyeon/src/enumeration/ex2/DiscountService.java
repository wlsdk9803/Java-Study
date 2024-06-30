package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {
    //문자를 받는 대신 classGrade라는 타입을 받는다.
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if(classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 x");
        }

        //10000 * (20 / 100) -> 2000원 할인
        return price * discountPercent / 100;
    }
}
