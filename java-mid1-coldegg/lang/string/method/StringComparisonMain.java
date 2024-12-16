package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java";
        String str2 = "hello, java";
        String str3 = "hello, python";

        System.out.println("str1 equals str2:"+str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2:"+str1.equalsIgnoreCase(str2));

        System.out.println("b compareTo a: "+"b".compareTo("a")); //1 : 사전상의 거리
        System.out.println("c compareTo a: "+"c".compareTo("a")); //2
        System.out.println("str1 compareTo str3: "+str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " +str1.compareToIgnoreCase(str2)); //0

    }
}
