package poly.ex3;

// 추상 클래스 (직접 인스턴스 생성 불가능)
public abstract class AbstractAnimal { // 추상 메서드가 하나라도 있으면 무조건 추상 클래스로 정의해야 한다.

    // 추상 메서드
    public abstract void sound(); // 자식 클래스는 이걸 반드시 오버라이딩 해야 함 // 그렇지 않으면 자식도 추상 클래스어야 함.

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}