package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
        // 메모리 공간 세 개에 다 10으로 차지
        // 모든 인스턴스가 같은 값 사용 => 메모리 낭비
        // static 영역을 사용하자! => static final (바뀌지 않는 공용 변수)

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE); // 클래스 영역
    }
}
