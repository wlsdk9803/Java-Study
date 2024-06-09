package lang.String.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("메서드 호출 비교 " + isSame(str1, str2)); //true

        String str3 ="hello"; //x003
        String str4 = "hello"; //x004
        System.out.println("메서드 호출 비교 " + isSame(str3, str4)); //true
    }

    private static boolean isSame(String x, String y) {
//        return x == y;
        return x.equals(y);
    }
}
