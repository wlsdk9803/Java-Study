package week5.poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound();
    //추상 클래스의 경우, 추상이 아닌 메소드도 포함될 수 있다.
    public void move() {
        System.out.println("동물이 이동합니다.");
    }
}
