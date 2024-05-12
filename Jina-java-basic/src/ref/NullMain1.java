package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); // 이때 멤버변수 value는 0으로 초기화 됨
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
        // 이렇게 되면 앞의 Data 인스턴스는 아무도 참조하지 않으므로 다시 접근할 방법 없음
        // => 메모리 용량만 차지
        // => 자바는 이걸 GC(Garbage Collection)으로 자동으로 메모리에서 제거
        // 지역 변수가 대표적인 예
    }
}
