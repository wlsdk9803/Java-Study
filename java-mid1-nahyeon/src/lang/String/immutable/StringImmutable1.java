package lang.String.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat("java"); //불변 객체이므로...

        System.out.println("str = " + str);
    }
}
