package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); //자식이 반드시 오버라이딩 해야 한다

    public void move() {
        System.out.println("동물이 움직임");
    }
}
