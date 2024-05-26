package week5.poly.ex3;

public class HelloAnimal extends AbstractAnimal{
    //따라서 이를 상속받는 클래스도 추상 클래스여야 함
    //그러나, 해당 추상 메소드를 override한다면 추상 메소드가 호출될 일이 없으므로 추상 클래스가 아니어도 됨
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

}
