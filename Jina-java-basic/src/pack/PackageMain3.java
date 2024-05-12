package pack;

import pack.a.User; // 보통 자주 사용하는 거 import

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); // 이미 pack.a의 User를 import 해서 pack.b의 User는 일일이 써줘야 함 (어쩔 수 없이 둘 중 하나는 다 적어줘야 한다는 뜻)
    }
}
