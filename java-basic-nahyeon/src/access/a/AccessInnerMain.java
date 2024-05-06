package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public (가능)
        data.publicField = 1;
        data.publicMethod();

        //default (가능)
        data.defaultField = 2;
        data.defaultMethod();

        //private -> xxxxxxxx (컴파일 에러)
//        data.privateField = 3; has private access~~~
//        data.privateMethod();

        data.innerAccess(); //내부에서는 클래스의 모든 필드, 메서드에 접근 가능
    }
}
