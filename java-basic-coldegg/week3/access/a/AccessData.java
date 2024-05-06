package week3.src.access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    //퍼블릭 메소드
    public void publicMethod(){
        System.out.println("PubM 호출"+publicField);
    }

    //디폴트 메소드
    void defaultMethod(){
        System.out.println("DM 호출" + defaultField);
    }

    //프라이빗 메소드
    private void privateMethod(){
        System.out.println("PriM 호출"+privateField);
    }

    //퍼블릭 메소드 - 클래수 내부 메소드에서 속성을 호출하는 것은 언제나 가능
    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
    }


}
