package poly.ex5;

// 인터페이스는 순수 추상 클래스라고 보면 될 것 같다...!
public interface InterfaceAnimal {
    void sound(); // public abstract이 default라 생략 가능
    void move();
}
// (순수 추상 클래스가 아닌) 인터페이스를 사용해야 하는 이유
// 1. 제약 (순수 추상 클래스는 누군가 언젠가 실행 가능한 메서드를 끼워 넣을 수 있다. 인터페이스는 이런 문제 원천 차단!)
// 2. 다중 구현 (클래스는 부모를 여러 명 두는 다중 상속 불가. 인터페이스는 다중 구현 가능. 왜냐? 어차피 오버라이딩 된 게 호출되니까! (다이아몬드 문제 발생X))