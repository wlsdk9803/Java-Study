package lang.imutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울"); //x001

        MemberV2 member1 = new MemberV2("나현",address); //나현이의 address 변수는 x001
        MemberV2 member2 = new MemberV2("진아",address); //진아의 address 변수도 x001

        //진아의 주소만 변경
        //member2.getAddress().setValue("부산"); //바꿀수있는 변경메소드가 없음
        member2.setAddress(new ImmutableAddress("부산"));
        System.out.println("나현이의 정보: "+member1);
        System.out.println("진아의 정보: "+member2);
    }
}
