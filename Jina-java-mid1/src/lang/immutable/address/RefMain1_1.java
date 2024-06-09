package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // a의 value도 '부산'으로 바뀐다.
        System.out.println("b = " + b);
        // b의 value만 바꾸고 싶었는데 a의 value도 같이 바뀐거라면...?  => 사이드 이펙트(Side Effect)
    }
}
