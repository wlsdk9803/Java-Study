package poly.ex3;

public class Dog extends AbstractAnimal{
    @Override
    public void sound() { //추상 메서드를 자식이 구현
        System.out.println("멍멍");
    }

    //move는 추상 메서드가 아니므로 반드시 오버라이딩 할 필요는 없다
}
