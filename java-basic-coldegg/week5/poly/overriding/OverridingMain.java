package week5.poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method(); //child 메소드

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method(); //parent 메소드

        //부모 변수가 자식 인스턴스 참조 => 다형적 참조
        Parent poly = new Child();
        System.out.println("Parent가 Child를 참조");
        //변수는 오버라이딩이 되지 않음
        System.out.println("value = " + poly.value); //parent의 value 출력
        //메서드는 오버라이딩
        poly.method(); //child의 method 출력
    }
}
