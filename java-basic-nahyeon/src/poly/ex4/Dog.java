package poly.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() { //추상 메서드를 자식이 구현
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
