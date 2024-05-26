package week4.extends1.super2;

public class ClassA {

    public ClassA(){
        System.out.println("ClassA 생성자 호출");
    }

    public ClassA(int a){
        System.out.println("매개변수가 하나인 ClassA 생성자 호출: " + a );
    }

    public ClassA(int a, int b){
        System.out.println("매개변수가 두개인 ClassA 생성자 호출: " + a + " " + b);
    }
}
