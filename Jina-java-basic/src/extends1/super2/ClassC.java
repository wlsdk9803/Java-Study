package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        // super(); // ClassB는 기본 생성자가 없어서 컴파일 에러
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
