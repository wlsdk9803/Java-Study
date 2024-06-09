package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); // false // x001과 x002를 비교하기 때문에
        System.out.println("equality = " + (user1.equals(user2))); // false // 기본으로 제공하는 equals()는 ==으로 비교하기 때문!
        // 동등성이라는 개념은 클래스마다 다르기 때문에 동등성 비교를 하고 싶으면 equals() 메서드를 재정의해야 한다.
    }
}
