package extends1.overriding;

public class ElectricCar extends Car {

    @Override // annotation: 프로그램이 읽을 수 있는 특별한 주석 // 없어도 됨 // 하지만 무조건 쓴다. 왜냐? 오버라이딩이 정확히 안됐을 때 컴파일 에러를 발생시키기 위해
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge(){
        System.out.println("충전합니다.");
    }
}
