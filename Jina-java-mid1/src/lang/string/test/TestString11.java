package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        // 코드 작성
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        System.out.println(reversedStr);
    }
}
