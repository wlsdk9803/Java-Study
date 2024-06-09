package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "   Java Programming ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase()); //     java programming
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase()); //     JAVA PROGRAMMING
        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'"); // 'Java Programming' // 단순 Whitespace 공백만 제거 가능
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'"); // 'Java Programming' // Whitespace와 유니코드 공백 모두 제거 // 자바11부터 지원
        System.out.println("앞 공백 제거(strip): '" + strWithSpaces.stripLeading() + "'"); // 'Java Programming '
        System.out.println("뒤 공백 제거(strip): '" + strWithSpaces.stripTrailing()+ "'"); // '   Java Programming'
    }
}
