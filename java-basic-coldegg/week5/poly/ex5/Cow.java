package week5.poly.ex5;

public class Cow implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("음메에");
    }
    @Override
    public void move() {
        System.out.println("소가 이동합니다.");
    }
}
