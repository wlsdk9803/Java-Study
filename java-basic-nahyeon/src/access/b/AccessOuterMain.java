package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public (가능)
        data.publicField = 1;
        data.publicMethod();

        //default (다른 패키지에 소속되어 있으므로 불가능)
//        data.defaultField = 2;
//        data.defaultMethod();  cannot be accessed from outside package

        //private -> xxxxxxxx (컴파일 에러)
//        data.privateField = 3; has private access~~~
//        data.privateMethod();

        data.innerAccess(); //내부에서는 클래스의 모든 필드, 메서드에 접근 가능
    }
}
