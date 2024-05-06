package week3.src.access.a;

public class AccessDataMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defaultMethod();

        //private 속성 필드는 AccessData클래스에서만 호출 가능
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();

    }
}
