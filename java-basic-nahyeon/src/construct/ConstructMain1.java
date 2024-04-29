package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); //객체 생성과 동시에 생성자 호출
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80); //객체 생성과 동시에 생성자 호출
        // 메모리 할당한 이후 바로 호출

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
