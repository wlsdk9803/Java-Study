package week3.src.memory;

import static week3.src.memory.JavaMemoryMain1.method1;
import static week3.src.memory.JavaMemoryMain1.method2;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("Main start");
        method1();
        System.out.println("Main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); //힙 영역에 data1의 인스턴스 변수들 적재, 스택 영역에 data1 = 참조값 대입
        method2(data1); //data1의 참조값 x001을 매개변수로 전달
                        //method2 실행시, Data data2 = data1;으로 스택 영역에 data2 지역변수가 x001 주소값을 담음
        System.out.println("method2 start");

    }

    private static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = "+data2.getValue());
        System.out.println("method2 start");

    }


}
