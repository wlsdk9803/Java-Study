package lang.string.method;

public class StringUtilMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool,
                str);
        System.out.println(format1);
        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        //prinft: print에 format을 바로 사용
        System.out.printf("숫자: %.2f\n", 10.1234);

        //matches:
        String regex = "Hello, (Java!|World!)"; //Hello, Java! 혹은 World! 형태와 일치하는지?
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}
