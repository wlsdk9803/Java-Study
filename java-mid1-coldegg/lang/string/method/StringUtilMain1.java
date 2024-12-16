package lang.string.method;

public class StringUtilMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf: 문자열로 변환
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objString);
        //아래 형태로도 변환 가능
        String numString2 = "" + num; //문자 + 다른형태 = 문자 로 변환됨
        System.out.println("빈문자열 + num:" + numString2);

        //toCharArray: 문자열을 문자 배열로 변환
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
