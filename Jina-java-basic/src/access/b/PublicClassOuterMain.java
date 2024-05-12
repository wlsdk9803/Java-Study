package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가 // import 해도 안된다는 뜻
        // DefaultClass1 class1 = new DefaultClass1();
    }
}
