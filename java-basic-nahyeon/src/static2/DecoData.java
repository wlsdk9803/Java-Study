package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근 가능
        // 둘 다 클래스 소속이라 가능함

//        instanceValue++; //인스턴스 변수 접근
//        instanceMethod(); //인스턴스 메서드 접근
        // 둘 다 컴파일 에러남
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        DecoData.staticValue++; // 정적 변수 접근
        staticValue++;
        staticMethod(); // 정적 메서드 접근 가능
        // static은 모든 객체에서 공용임 그래서 가능

        // 모두 가능
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod(); // 참조값 통해서 접근 가능
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
