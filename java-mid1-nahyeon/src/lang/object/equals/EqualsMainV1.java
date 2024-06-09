package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));
        /*
        *  public boolean equals(Object obj) {
        * -> 기본적으로는 동일성 비교를 제공, 동등성 비교를 하고 싶다면 클래스에서 오버라이딩 해야 함!
            return (this == obj);
        }*/
    }
}
