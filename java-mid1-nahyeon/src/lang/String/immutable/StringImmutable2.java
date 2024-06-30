package lang.String.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat("java"); //불변 객체이므로... 새로운 결과를 만들어서 반환

        System.out.println("str = " + str2);
    }
}
