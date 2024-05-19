package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child(); // a는 참조값(x001)을 가지고, 해당 주소에서 메모리에는 Child와 InferfaceA, inferfaceB가 모두 존재한다.
        a.methodA();
        a.methodCommon(); // 먼저 x001 Child 인스턴스를 찾고, a가 InferfaceA 타입이므로 해당 타입에서 methodCommon()을 찾는다. 그리고 이 메서드는 Child에서 오버라이딩 되어 있으므로 Child의 methodCommon()이 호출된다.

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
