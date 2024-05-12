package construct;

public class MemberDefault {
    String name;

    // 기본 생성자 (안만들어도 자동으로 생성됨)
    public MemberDefault(){ // 'public'은 접근 제어자에서 다룰 예정
        System.out.println("생성자 호출");
    }
}
