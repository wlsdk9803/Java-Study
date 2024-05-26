package week5.poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound();
    //추상 메소드는 작동하지 않게 만든 메소드
    //조건: 해당 클래스가 작동하지 않는 불완전한 메소드를 가지고 있으므로,
    //하나이상 추상 메소드가 존재한다면, 해당 클래스 또한 추상 클래스로 반드시 제한해줘야 함

    public void move(){
        System.out.println("꽁꽁얼어붙은 한강위로 animal이 걸어갑니다.");
    }
}
