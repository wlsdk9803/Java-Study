package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{ // 상속은 하나만, 인터페이스는 다중구현이 가능하므로, 둘이 함께 나온 경우에는 extends가 먼저 나와야 한다.
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
