package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가: 생성자가 2개!! => 오버로딩
    MemberConstruct(String name,int age) {
        this(name, age, 50); //Q.this=인스턴스 와 대입되는 줄 알았는데 this()으로 입력하면 내가 생성한 인스턴스의 생성자'()'로 접근한다 ?
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
                grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
