package week6.car1;

public class Driver {
    private Car mycar;

    public void setCar(Car car){
        System.out.println("자동차를 설정합니다: " + car);
        this.mycar = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다. ");
        mycar.startEngine();
        mycar.pressAccelerator();
        mycar.offEngine();
    }
}
