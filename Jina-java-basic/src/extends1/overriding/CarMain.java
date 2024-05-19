package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(); // 자식 클래스의 객체를 생성하면 부모와 자식이 모두 생성된다.
        electricCar.move(); // 먼저 호출자의 타입인 ElectricCar에서 move() 메서드가 있는지 찾고, 없으면 부모 클래스에서 찾는다. 또 없으면 그 부모... 끝까지 가도 없으면 컴파일 에러

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
