package week4.extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        this(100,100);
        System.out.println("ClassC 생성자 호출");
    }

    public ClassC(int a) {
        super(0);
        System.out.println("매개변수가 하나인 ClassC 생성자 호출: " + a);
    }

    public ClassC(int a,int b) {
        super(a,50);
        System.out.println("매개변수가 두개인 ClassC 생성자 호출: " + a + " " + b);
    }
}
