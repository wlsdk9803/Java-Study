package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        //ClassB에서느는 생성자를 만들었으므로 자바에서 만들어주는 기본 생성자가 없고, 따라서 super()또한 자동으로 호출해주지 않는다.
        //따라서 개발자가 직접 부모의 생성자를 호출해줘야 한다.
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
