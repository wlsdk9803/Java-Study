package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2", "seo"); //id는 안 바뀜 -> 잘못 만든 메서드
        member.print();

        member.changeData2("lee"); //제대로 만든 메서드
    }
}
