package lang.imutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값을 b에도 대입
        System.out.println("a= "+a);
        System.out.println("b= "+b);

//      *error:  b.setValue("부산"); //b의 값이 수정이 안된다는 것을 알게됨
        b = new ImmutableAddress("부산"); //b만이 참조하는 새로운 참조값을 대입
        System.out.println("a= "+a);
        System.out.println("b= "+b);


    }
}
