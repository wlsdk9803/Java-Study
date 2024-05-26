package week4.overriding;

public class ElectricCar extends Car {

    //전기차 메소드1: 공통 메소드를 상속받아 재정의
    @Override
    public void move(){
        System.out.println("가속 이동합니다.");
    }

    //전기차 메소드2: 충전 기능
    public void charge(){
        System.out.println("충전합니다.");
    }

//    @Override //error: static 메소드를 재정의할 수 없다.
//    public void call(){
//        System.out.println("전기차에 대한 문의는 032-0001로 부탁드립니다.");
//    }
}
