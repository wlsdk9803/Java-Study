package week5.poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent타입 변수 => Parent 인스턴스 참조값");
        Parent parent = new Parent(); //부모 인스턴스 생성
        parent.parentMethod(); //부모가 가진 메소드 실행

        System.out.println("Child 타입 변수 => Child 인스턴스 참조값");
        Child child = new Child(); //자식 인스턴스 생성
        child.parentMethod();  //Parent를 상속받은 Chilld : Parent의 메소드를 실행

        System.out.println("Parent 타입 변수 => Child 인스턴스 참조값");
        Parent poly = new Child(); //자식 인스턴스 생성 인데, Parent 타입의 변수에 정의?
        poly.parentMethod();

    }
}
