package week5.poly.ex5;

public interface InterfaceAnimal {

//    public abstract void sound(); 이미 인터페이스로 생성하면 abstract 선언이 필요가 없음
    void sound(); //public abstract 생략되어 있는 것
    void move();  //왜 public이냐? 클래스가 가지는 private한 요소가 없고 구현을 위해 만들어지기 때문
}
