package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj){
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }
}

// 정적 의존관계 VS 동적 의존관계
// 1. 정적 의존관계: 컴파일 시간에 결정되고, 주로 클래스간의 관계를 의미한다.
// 2. 동적 의존관계: 런타임 시간에 어떤 인스턴스를 사용하는지를 나타낸다.
// 단순히 의존관계라고 하면 주로 정적 의존관계를 뜻한다.