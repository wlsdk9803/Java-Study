package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
// 하지만 문자열 상수를 사용해도, 지금까지 발생한 문제들을 근본적으로 해결할 수 는 없다.
// 어떤 개발자가 실수로 StringGrade에 있는 문자열 상수를 사용하지 않고, 다음과 같이 직접 문자열을 사용해도 막을 수 있는 방법이 없다.