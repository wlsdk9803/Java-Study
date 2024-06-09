package lang.String.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교 " + (str1 == str2)); //false
        System.out.println("new String() equals 비교 " + (str1.equals(str2))); //true

        String str3 ="hello"; //x003
        String str4 = "hello"; //x004
        System.out.println("new String() == 비교 " + (str3 == str4)); //true
        System.out.println("new String() equals 비교 " + (str1.equals(str2))); //true
    }
}
