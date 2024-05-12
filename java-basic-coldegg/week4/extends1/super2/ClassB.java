package week4.extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(a);
        System.out.println("매개변수가 하나인 ClassB 생성자 호출: " + a);

    }

    public ClassB(int a, int b){
        super(a,b);
        System.out.println("매개변수가 두개인 ClassB 생성자 호출: "+ a + " "+ b);
    }
}
