package pack.a; // 패키지 이름은 소문자로 // 패키지 이름 앞 부분은 보통 회사 도메인 이름을 거꾸로

public class User {

    // 다른 패키지에서 이 클래스의 생성자를 호출하려면 public이어야 함
    public User(){
        System.out.println("패키지 pack.a 회원 생성");
    }
}

// 패키지가 계층 구조를 이루더라도 다 다른 패키지임
// 즉, a 패키지의 클래스에서 a.b 패키지의 클래스가 필요하면 import 해야 함!
