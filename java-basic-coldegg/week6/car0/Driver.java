package week6.car0;

public class Driver {

    private K3Car k3; //초기값 null
    private Model3Car model3;

    public void setK3(K3Car k3) {
        this.k3 = k3;
    } //driver 인스턴스의 k3타입 객체를 지정해주겠다.

    public void setmodel3(Model3Car model3) {
        this.model3 = model3;
    } //driver 인스턴스의 model3타입 객체를 지정해주겠다.
    // set 단축명령어

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3 != null) {
            k3.startEngine();
            k3.pressAccelerator();
            k3.offEngine();
        } else if (model3 != null) {
            model3.startEngine();
            model3.pressAccelerator();
            model3.offEngine();
        }
        }
    }



