package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원A, B의 처음 주소는 모두 서울
        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);

        //회원 B의 주소를 부산으로 변경해야 함
//        memberB.getAddress().setValue("부산") //컴파일 오류
        memberB.setAddress(new ImmutableAddress("부산")); // address 자체가 불변인 것이고 B는 불변 객체가 아님
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA); //회원 A는 기존 주소 유지
        System.out.println("memberB = " + memberB);

    }
}
