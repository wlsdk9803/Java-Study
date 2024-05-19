package poly.ex4;

// 순수 추상 클래스 (모든 메서드가 추상 메서드)
// 오로지 다형성을 위한 껍데기 역할
// USB 인터페이스 규격 느낌
// 자바는 순수 추상 클래스를 더 편리하게 사용할 수 있도록 인터페이스라는 개념 제공
public abstract class AbstractAnimal {
    public abstract void sound();
    public abstract void move();
}
