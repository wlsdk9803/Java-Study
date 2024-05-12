package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        // 전기차와 가솔린차는 자동차의 조금 더 구체적인 개념이다.
        // 자동차는 전기차, 가솔린차를 포함하는 추상적인 개념이다.

        // 전기차와 가솔린차의 공통 기능 -> 이동
        // 이 경우 상속 관계를 사용할 수 있다.
    }
}
