package lang.string.equlas;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hu"); //x001
        String str2 = new String("hu"); //x002
        System.out.println(str1==str2); //참조값
        System.out.println(str1.equals(str2)); //equals는 기본적으로 ==이지만, String에서는 문자열로 확인하도록 되어있음

        String str3 = "hi";
        String str4 = "hi";
        //문자열 풀에서 "hi"를 생성해놓고 같은 참조값을 사용하도록 지정
        System.out.println(str3==str4); //같은 참조값이므로 true
        System.out.println(str3.equals(str4)); //equals는 기본적으로 ==이지만, String에서는 문자열로 확인하도록 되어있음
    }
}
