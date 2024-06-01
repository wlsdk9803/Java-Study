package week6.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver coldegg = new Driver();
        K3Car k3_red = new K3Car();

        coldegg.setK3(k3_red);
        coldegg.drive();
    }
}
