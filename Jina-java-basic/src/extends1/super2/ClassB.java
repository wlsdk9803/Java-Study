package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a){
        //super(); // 기본 생성자 생략 가능
        this(a, 0); // this를 써도 언젠가 한 번은 super를 호출해야 함.
        System.out.println("ClassB 생성자 a = " + a);
    }
    public ClassB(int a, int b){
        // super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
