package week4.overriding;

public class Car {

    //주유차(가솔린차)와 전기차는
    //차 라는 공통 속성을 가짐
    //Car 에 속하는 클래스는 모두 이동 기능을 가져야 한다.

    //공통 메소드1: 이동 기능
    public void move() {
        System.out.println("이동합니다.");
    }

    //공통 메소드 추가: 문열기 기능
    public void open() {
        System.out.println("문을 엽니다.");
    }

    //test: static 메소드 추가
    static public void call() {
        System.out.println("해당 자동차를 만든 회사는 현대이며, 문의는 032-0000으로 부탁드립니다.");
    }
}
