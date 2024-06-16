package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        String result2 = a + b; // 참조형끼리 더한다는 것이 원래 말이 안되는 건데, 자바 문자열은 너무 자주 다뤄지므로 자바에서 특별히 편의상 '+' 연산자를 제공한다.
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
