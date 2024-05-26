package poly.diamond;

public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() { //A와 B에 둘 다 있으므로 하나만 오버라이딩 하면 됨
        System.out.println("Child.methodCommon");
    }
}
