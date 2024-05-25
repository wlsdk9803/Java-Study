package poly.ex5;

public class Dog implements InterfaceAnimal{ // inferface는 구현한다는 의미로 extends 대신 implements를 사용한다.

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
