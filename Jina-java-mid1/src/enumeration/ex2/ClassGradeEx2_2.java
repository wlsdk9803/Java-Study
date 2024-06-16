package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
//        ClassGrade newClassGrade = new ClassGrade(); // 어떤 개발자가 이렇게 인스턴스를 생성하는 경우가 발생할 수 있음. 따라서 외부에서 ClassGrade를 생성할 수 없도록 막아야 한다. => 기본 생성자를 private으로 변경하자
//        int result = discountService.discount(newClassGrade, price);
//        System.out.println("newClassGrade 등급의 할인 금액: " + result);
    }
}
