package week4.extends1.ex3;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.open();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillup(); //hydrogenCar 자식의 메소드
        hydrogenCar.open(); //부모의 메소드
    }
}
