package lang.string.immutable;

// String은 불변 객체이므로 생성 이후에 절대로 내부의 문자열 값을 변경할 수 없다.
public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java"); // concat()은 새로운 String 객체를 만들어서 반환한다.
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
    // String이 불변으로 설계되지 않는다면
    // 기존 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가 함께 변경되는 대참사가 발생할 수 있다. // 사이드 이펙트
}
