package static2;

// import static static2.DecoData.staticCall;
import static static2.DecoData.*; // 이렇게 import 하면 클래스 명 생략 가능

public class DecoDataMain {
    public static void main(String[] args) { // main 메서드는 대표적인 정적 메서드 => 객체 생성 없이 바로 실행 가능 & 메서드를 사용할 때 항상 static을 붙임
        System.out.println("1. 정적 호출");
        staticCall(); // import로 인해 클래스 명 생략
        // DecoData.staticCall(); // 당연히 이것도 가능

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); // 권장하지 않는 방법 // 인스턴스 메서드인 것처럼 느껴짐

        // 클래스를 통한 접근
        staticCall();
    }
}
