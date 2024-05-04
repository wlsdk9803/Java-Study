package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // static은 static 붙은 것에만 접근 가능
    // static에 접근하는 건 다 가능

    public static void staticCall(){
//        instanceValue++; // 인스턴스 변수 접근 // 컴파일 에러
//        instanceMethod(); // 인스턴스 메서드 접근 // 컴파일 에러 // 이건 인스턴스가 생성되어야 힙 영역에 생기는 것임. 생긴다해도 뭘 참조해...? => 접근 불가능

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }
    public static void staticCall(DecoData data){ // 이렇게 객체의 참조값을 매개변수로 전달하면 가능하다. (너무 당연함)
        data.instanceValue++;
        data.instanceMethod();
    }
    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 접근 // 본인의 인스턴스에 있는 변수에 접근하는 것
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근 // 클래스에 가서 거기 있는 변수에 접근
        staticMethod(); // 정적 메서드 접근
    }
    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
