package week3.src.memory;

public class JavaMemoryMain1 {

    //1. main메소드 실행
    public static void main(String[] args) {
        System.out.println("Main start");
        method1(10); //2. 여기까지 읽고, method1 실행
        System.out.println("Main end");
    }   //6. main 종료 후 프로그램 종료

    static void method1(int m1){
        System.out.println("method1 start");
        int cal = m1 * 2; //20
        method2(cal); //3. 여기까지 읽고, method2 실행
        System.out.println("method1 end");
        //5. method1 종료 후 2번으로 돌아감
    }
    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    } //4. method2 종료 후 3번으로 돌아감
}

