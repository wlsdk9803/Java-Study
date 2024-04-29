package pack;

//import pack.a.User; // User class import하기
import pack.a.*;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지 속 클래스는 패키지 경로 생략 가능
//        pack.a.User user = new pack.a.User(); // 다른 패키지에 속해 있으므로 경로 생략 불가능 -> import해서 더 편하게 사용 가능!
        User user = new User();
    }
}
