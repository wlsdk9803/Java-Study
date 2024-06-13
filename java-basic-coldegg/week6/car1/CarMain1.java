package week6.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver user = new Driver();

        //차량 선택
        K3Car k3 = new K3Car(); //x001 => mycar
        user.setCar(k3);
        user.drive(); //x001.startEngine ...
                        //mycar는 Car 타입이므로 Car에서 startEngine을 먼저 찾고,
                        //override된 것이 있으므로 K3Car타입의 startEngine을 호출하게 됨

        System.out.println(k3);

        //차량 변경
        Model3Car model3 = new Model3Car();
        user.setCar(model3);
        user.drive();

        //차량 변경
        NewCar news = new NewCar();
        user.setCar(news);
        user.drive();
    }
}
