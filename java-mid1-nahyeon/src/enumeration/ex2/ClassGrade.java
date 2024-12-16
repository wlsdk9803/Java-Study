package enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
    //등급별 상수 선언(static + final)
    //각각의 상수마다 별도의 인스턴스 생성, 생성한 인스턴스 댑입

    //private 생성자 추가.
    //외부에서 새로운 ClassGrade를 생성하지 못하게 막음
    private ClassGrade() {

    }
}
