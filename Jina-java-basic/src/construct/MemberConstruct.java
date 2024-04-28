package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    // 클래스의 이름과 같아야 함 & 반환 타입이 없음
    // 안만들면 기본 생성자가 만들어짐 (하나라도 만들면 기본 생성자는 만들어지지 않음)

    // 생성자 장점
    // 1. 객체를 생성하면서 동시에 생성 직후 필요한 작업을 한 번에 처리할 수 있음
    // 2. 제약: 실수로 초기 값 설정하는 과정을 빼먹는 대참사 방지 (빼먹으면 컴파일 에러)
   
    // 생성자 오버로딩: 생성자도 메서드 오버로딩처럼 매개변수만 다르게 해서 여러 생성자 제공 가능

//    MemberConstruct(String name, int age){
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }

    MemberConstruct(String name, int age){
        this(name, age, 50); // 두 생성자 사이의 중복되는 코드 제거 // (name, age, 50(grade)) 가지고 매개변수가 3개인 생성자 호출
        // 즉 'this'를 사용하면 생성자 내부에서 자신의 생성자 호출 가능
    }
    
    // this() 규칙
    // 생성자 코드의 첫 줄에만 사용 가능

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
