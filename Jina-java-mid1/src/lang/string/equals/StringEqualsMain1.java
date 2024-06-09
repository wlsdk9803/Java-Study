package lang.string.equals;

// String 클래스 비교에서는 ==이 아니라 항상 equals() 사용
// ==은 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인하고
// equals() 메서드는 두 객체가 논리적으로 같은지 확인한다.
public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("new String() == 비교: " + (str1 == str2)); // false
        System.out.println("new String() equals 비교: " + str1.equals(str2)); // true

        String str3 = "hello"; // 문자열 리터럴
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true // 왜지...?
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); // true

        // 문자열 리터럴을 사용하는 경우 자바는 문자열 풀을 사용한다.
        // 자바가 실행되는 시점에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어둔다. 이때 같은 문자열이 있으면 만들지 않는다.
        // 이후 문자열 리터럴을 사용하면 문자열 풀에서 해당 문자열을 가진 인스턴스의 참조를 반환한다.
        // 따라서 str3와 str4는 같은 참조값을 가지게 된다.
    }
}
