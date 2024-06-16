package enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가
    private ClassGrade() {}
}

// 이런 타입 안전 열거형 패턴은 타입 안정성 향상, 데이터 일관성 등의 장점이 있지만,
// 위의 코드를 다 작성해야 한다는 단점이 있다.
// 따라서 자바 언어에서는 이걸 편리하게 사용할 수 있는 '열거형'을 제공한다.