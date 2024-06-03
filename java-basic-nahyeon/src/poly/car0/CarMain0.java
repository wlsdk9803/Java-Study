package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car); //참조형 변수에 생성된 K3Car 객체 주소 넣기 -> 운전자가 실제 차를 가짐
        driver.drive(); //K3Car의 메서드를 사용해 운전함 (기능을 사용함)

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive(); //model3Car의 메서드 사용
    }
}
