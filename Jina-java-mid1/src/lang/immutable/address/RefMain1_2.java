package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("서울"); // x001
        Address b = new Address("서울"); // x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // a와 b는 서로 다른 인스턴스를 참조하므로 b가 참조하는 인스턴스의 값을 변경해도 a에는 영향을 주지 않는다.
        System.out.println("b = " + b);

        // 이렇게 여러 변수가 하나의 객체를 공유하지 않으면 문제가 발생하지 않는다.
        // 그런데 하나의 객체를 여러 변수가 공유하지 않도록 강제로 막을 수 있는 방법이 없다.
    }
}
