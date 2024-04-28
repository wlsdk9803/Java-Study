package pack;

// import pack.a.User;
import pack.a.*; // pack.a에 있는 클래스 모두 import

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 해서 패키지 명 생략 가능
    }
}
