package poly.ex5;

public class Dog implements InterfaceAnimal {//상속 x 구현 o
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
