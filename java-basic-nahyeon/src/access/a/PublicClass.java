package access.a;

public class PublicClass { // public 이므로 외부에서 접근 가능한 클래스
    // 파일명과 클래스명이 무조건 같아야 한다.
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}


// 같은 패키지 안에서는 이 클래스들을 자유롭게 사용할 수 있다.
class DefaultClass1 {

}

class DefaultClass2 {

}
