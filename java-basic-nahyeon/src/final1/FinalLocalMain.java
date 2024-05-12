package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; //다시 할당하려고 할 시 컴파일 오류 발생!

        // final 지역 변수2
        final int data2 = 10; //선언과 동시에 초기화
//        data2 = 20 ; // 컴파일 오류
        method(10); //이 이후는 parameter 재할당 불가능
    }

    static void method(final int parameter) {
        // parameter = 20; //컴파일 오류!
    }
}
