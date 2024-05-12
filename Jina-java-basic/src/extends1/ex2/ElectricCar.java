package extends1.ex2;

public class ElectricCar extends Car{
    // 상속 구조도에서 화살표는 ElectricCar -> Car 방향
    // 화살표는 '내가 쟤를 안다'라는 의미!
    // 즉, 자식만 부모가 누군지 알고, 부모는 자식이 누군지 모름
    
    // 자바는 다중 상속 지원 안함

    public void charge(){
        System.out.println("충전합니다.");
    }
}
