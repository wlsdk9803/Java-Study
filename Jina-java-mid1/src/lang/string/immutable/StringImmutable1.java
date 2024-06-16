package lang.string.immutable;

// String은 불변 객체이므로 생성 이후에 절대로 내부의 문자열 값을 변경할 수 없다.
public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str); // hello만 출력됨 // 왜? 불변객체이므로!
    }
}
