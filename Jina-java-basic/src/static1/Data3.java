package static1;

public class Data3 {
    public String name; // 인스턴스 변수
    public static int count; // 클래스 변수 (정적 변수, static 변수) // 프로그램 실행할 때 하나 생성하고 끝

    public Data3(String name){
        this.name = name;
        //Data3.count++;
        count++; // Data3 클래스 내부니까 생략 가능
    }

    // ----정리----
    // 지역변수 (매개변수 포함): 스택 영역 (생존 주기 가장 짧다)
    // 인스턴스 변수: 힙 영역
    // 클래스 변수: 메서드 영역의 static 영역 (생존 주기 가장 길다)
}
