package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 생략 가능, 생략 권장

        Parent parent2 = child; // 업캐스팅 생략 (부모는 자식을 담을 수 있다)

        parent1.parentMethod();
        parent2.parentMethod();
        //Parent의 메소드 호출 당연히 가능
    }
}
