package construct;

public class MethodMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 16, 90);
        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 15, 80);


        MemberInit[] members = {member1, member1};
        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + "나이: " + s.age + "성적: " + s.grade);

        }
    }

    //첫번째 매개변수는 참조형 => member라는 매개변수에 참조값을 대입하기 위해
    static void  initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
