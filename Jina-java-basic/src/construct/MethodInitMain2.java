package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        // 객체 생성할 때마다 반복되니까 메서드를 활용하자
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};
        for(MemberInit member : members){
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
    // 근데 이 메서드 클래스 안에 지정해서 속성과 한 곳에 두면 더 좋겠다...! => 생성자 도입
}