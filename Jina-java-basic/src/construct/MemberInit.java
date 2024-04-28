package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 이건 MethodInitMain3부터 추가
    void initMember(String name, int age, int grade){
        // 멤버변수가 인자로 들어온 값으로 설정됨
        this.name = name;
        this.age = age;
        this.grade = grade;

        // 'this'는 인스턴스 자신의 참조 값을 가리킴
        // 'this' 안쓰면 구별 못해서 둘 다 인자로 들어온 name으로 인식
        // 따라서 그냥 쓰면 가까운 scope꺼(여기서는 매개변수), 'this' 쓰면 멤버 변수에 접근
    }
}
