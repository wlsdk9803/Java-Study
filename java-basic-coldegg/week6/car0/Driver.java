package week6.car0;

public class Driver {

    private K3Car k3; //초기값 null

    public void setK3(K3Car k3) {
        this.k3 = k3;
    } //driver 인스턴스의 k3타입 객체를 지정해주겠다.

    public void drive() {
        System.out.printf("자동차를 운전합니다.");
        k3.startEngine();
        k3.pressAccelerator();
        k3.offEngine();
    }

}

