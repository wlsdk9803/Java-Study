package poly.ex4;

public abstract class AbstractAnimal {
    //순수 추상 클래스로 수정
    public abstract void sound(); //자식이 반드시 오버라이딩 해야 한다

    public abstract void move();
}
