package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(); // method1 호출이 종료되면 더 이상 x001 참조 값을 가진 Data 인스턴스를 참조하는 것이 없다. => GC가 제거 (힙 영역 안에서만 서로 참조하는 경우에도 마찬가지)
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); // 힙 영역에 Data 인스턴스 생성하고 해당 인스턴스의 참조 값(x001)은 스택 영역의 data1에 저장
        method2(data1); // data1과 method2의 data2가 같은 참조 값 x001을 갖는다. // method2 호출이 종료되면 data2도 당연히 같이 사라짐
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end");
    }
}
