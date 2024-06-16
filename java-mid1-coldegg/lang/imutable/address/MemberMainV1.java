package lang.imutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울"); //x001

        MemberV1 member1 = new MemberV1("나현",address); //나현이의 address 변수는 x001
        MemberV1 member2 = new MemberV1("진아",address); //진아의 address 변수도 x001
        member2.getAddress().setValue("부산"); //x001의 데이터가 부산으로 바뀜

        System.out.println("나현이의 정보: "+member1);
        System.out.println("진아의 정보: "+member2);

    }
}
