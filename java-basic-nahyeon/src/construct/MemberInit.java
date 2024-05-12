package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name;
        /*
        * name = name;
        * scope(변수나 식별자가 유효한 범위) 우선순위 상 name은 이 메서드의 parameter인 name을 의미하게 된다.
        * parameter로 받은 name의 값을 멤버변수 name에 저장하고 싶을 때는 this 키워드가 필요하다.
        */
        this.age = age;
        this.grade = grade;
    }
}

