package extends1.overriding;

public class Car {
    public void move(){
        System.out.println("차를 이동합니다.");
    }
    // 만약 final 메서드이면 오버라이딩 불가
    // 접근제어자가 private이어도 오버라이딩 불가 (하위클래스는 접근 불가하므로)
    // static도 오버라이딩 불가(오버라이딩은 인스턴스 레벨, static은 클래스 레벨이라서)
    // 생성자도 오버라이딩 불가
    
    public void openDoor(){
        System.out.println("문을 엽니다.");
    }
}
