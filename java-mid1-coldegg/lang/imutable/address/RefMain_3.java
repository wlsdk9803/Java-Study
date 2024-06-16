package lang.imutable.address;

public class RefMain_3 {

    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a; //참조값을 b에도 대입
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        change(b,"부산"); //change 메소드가 어떤건지 잘 모르는 상태에서, 단순히 b의 주소만 바뀐다고 생각하게 됨 (사이드이펙트 발생)
        System.out.println("a= "+a); //a가 참조하는 곳은 b가 참조하는 곳과 동일함
        System.out.println("b= "+b);

    }
    private static void change(Address address, String changeAddress){
        System.out.println("주소값 변경=>" + changeAddress);
        address.setValue(changeAddress);
    }
}
