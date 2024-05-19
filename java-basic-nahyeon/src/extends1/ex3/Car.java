package extends1.ex3;

public class Car {
    public void move() { // 가솔린차와 전기차의 공통된 속성 (즉, 상속받을 메소드)
        System.out.println("차를 이동합니다.");
    }

    // 추가
    public void openDoor(){
        System.out.println("문을 엽니다");
    }
}
