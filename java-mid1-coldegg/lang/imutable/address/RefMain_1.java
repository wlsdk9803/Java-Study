package lang.imutable.address;

public class RefMain_1 {

    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a; //참조값을 b에도 대입
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        b.setValue("부산"); //b가 참조하는 곳의 데이터를 변경
        System.out.println("a= "+a); //a가 참조하는 곳은 b가 참조하는 곳과 동일함
        System.out.println("b= "+b);


    }
}
