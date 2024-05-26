package poly.car1;

public class Driver {
    //Dirver는 K3, Model3를 모른다.
    //Car만 사용
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다 : " + car);
        this.car = car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
