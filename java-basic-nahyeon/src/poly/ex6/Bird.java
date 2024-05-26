package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{ //인터페이스는 다중 상속이 가능하므로 implement가 extends 뒤에 와야 한다
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
