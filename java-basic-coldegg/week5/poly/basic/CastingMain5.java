package week5.poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent(); //부모 인스턴스에 child정보가 없다
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출"); //자식 인스턴스에는 child와 parent의 정보가 있다
        call(parent2);
    }

    private static void call(Parent parent) {
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            ((Child) parent).childMethod();
        } else {
            //부모 인스턴스에는 child 정보가 없으므로 메소드 호출 불가
            System.out.println("Child 인스턴스가 아님");
        }
    }
}
