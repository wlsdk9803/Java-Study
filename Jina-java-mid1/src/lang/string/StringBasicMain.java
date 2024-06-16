package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello"; // String은 대문자로 시작 => 클래스라는 뜻. 즉 참조형임
        String str2 = new String("hello"); // 따라서 이런 식으로 객체를 생성할 수 있다.
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // 원래 str1에는 String 인스턴스의 참조형만 들어갈 수 있는데
        // 문자열은 매우 자주 사용되므로
        // String str1 = "hello"; 이걸 자바에서
        // String str1 = new String("hello"); 이렇게 바꿔준다.

        // String 클래스 내부에서
        // private final char[] value; 이 부분을 통해 실제 문자열 값을 보관한다. (문자 데이터 자체는 char[]에 저장)
        // 자바9 이후에는 private final byte[] value; 로 변경되어 메모리를 더 효율적으로 관리한다.
        // char는 2byte를 차지하는데, 영어 숫자는 1byte만 차지하기 때문!

        // 문자열 메서드
        // length()
        // substring(int beginIndex, int endIndex)
        // charAt(int index): 특정 인덱스의 문자 반환
        // indexOf(String str): 특정 문자열이 시작하는 인덱스 반환
        // toLowerCase(), toUpperCase()
        // trim(): 문자열 양 끝 공백 제거
        // concat(String str)
    }
}
