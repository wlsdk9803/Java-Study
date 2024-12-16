package lang.imutable.address;

public class RefMain_2 {

    public static void main(String[] args) {
//        참조값을 공유하지 않도록 함으로써 사이드이펙트(b를 수정했는데 a도 같이 변경될 때)를 막는다.
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        b.setValue("부산"); //b가 참조하는 곳의 데이터를 변경
        System.out.println("a= "+a);
        System.out.println("b= "+b);


    }
}
