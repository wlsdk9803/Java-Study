package lang.String.method;

public class StringComparisionMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("st1 equals str2: " + str1.equals(str1));
        System.out.println("str1 equalsIgnoreCase str2: "+ str1.equalsIgnoreCase(str2)); //true

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));//1
        System.out.println("'a' compareTo 'b': " + "a".compareTo("b"));//-1
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));//2

        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));//-13
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2)); //대소문자 구분 없으면 같음

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));
    }
}
