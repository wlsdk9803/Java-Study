package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조 값 대입을 막을 수 있는 방법이 없다. 왜냐? 이건 자바 문법 상 맞는 것임!
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산");
        b = new ImmutableAddress("부산"); // ImmutableAddress는 불변 객체이므로 b가 참조하는 인스턴스의 값을 변경하려면 새로운 인스턴스를 생성해서 할당해야 한다.
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
