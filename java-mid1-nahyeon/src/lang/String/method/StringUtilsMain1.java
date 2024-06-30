package lang.String.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString); //"100"
        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolString); //"true"
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objString); //obj.toString 결과임

        // 문자 + x -> 문자
        String numString2 = "" + num; //얘도 문자가 되어버림
        System.out.println("\n빈 문자열 + num: " + numString2); //"100"이라는 문자가 됨

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + strCharArray);//참조값 나옴(+ 때문에)
        System.out.println(strCharArray); //Hello, Java!
        for (char c : strCharArray) { //Hello, Java!
            System.out.print(c);
        }
    }
}
