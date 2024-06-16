package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a+b; //x001 + x002 인 격 => error?
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2); //그러나 String 클래스 기본 기능으로 제공된다.
    }
}
