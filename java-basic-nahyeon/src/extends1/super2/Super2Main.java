package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
//        ClassC classC = new ClassC();
//        ClassA 생성자
//        ClassB의 생성자 a =10, b = 20
//        ClassC 생성자

        // this를 가장 먼저 사용하는 예외
        ClassB classB = new ClassB(100);
//        ClassA 생성자
//        ClassB의 생성자 a =10, b = 20
//        ClassB 생성자 a = 100
        // ClassB의 두 개의 생성자 중 하나는 무조건 super()를 호출해야 한다.
    }
}
