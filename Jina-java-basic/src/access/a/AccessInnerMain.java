package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 내 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess(); // 이건 public이니까 가능. innerAccess 메서드 내에서는 같은 클래스 내에 있는 것을 호출하는 것이므로 가능. 즉 에러 안남.
    }
}
