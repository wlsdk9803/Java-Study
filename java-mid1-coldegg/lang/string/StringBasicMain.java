package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        //int,double,booldean: 기본형
        //String: 클래스 => 참조형
        String str1 = "hello";
        //String은 기본으로 내장된 클래스이므로 객체로 생성할 수도 있음
        String str2 = new String("hello");
        System.out.println(str1);
        System.out.println(str2);
    }
}
