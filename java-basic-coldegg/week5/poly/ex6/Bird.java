package week5.poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    //AbstractAnimal의 sound()는 추상 메소드이기 때문에
    //규약을 지켜서 반드시 오버라이딩 해줘야함
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void fly() {
        System.out.println("날기");
    }
}
