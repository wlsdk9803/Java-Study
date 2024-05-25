package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경 (k3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();

        // OCP(Open-Closed Principle)란?
        // 기능을 추가해도 기존 코드를 바꾸지 않고(Closed for modification) 확장할 수 있음(Open for extension)
        // 확장에 열려있다 => Car 인터페이스를 통해 새로운 차량을 자유롭게 추가하고 호출할 수 있음
        // 코드 수정은 닫혀있다 => 새로운 차를 추가하게 되면 기존 코드의 수정은 불가피함
        // 새로운 자동차를 추가할 때 가장 영향을 받는 클라이언트인 Driver의 코드는 변하지 않음.
        // main()처럼 새로운 차를 생성하고 클라이언트에게 전달해주는 부분은 당연히 코드 수정이 발생한다.
        // 이게 디자인패턴 중의 하나인 전략패턴(알고리즘을 클라이언트 코드 변경 없이 쉽게 교체 가능)이기도 하다.
    }
}
