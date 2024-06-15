package lang.String.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str= "Hello, Java!";
        System.out.println("문자열의 길이 : " + str.length()); //12
        System.out.println("문자열이 비어 있는지? : " + str.isEmpty()); //false
        System.out.println("문자열이 비어 있거나 공백인지? : " + str.isBlank()); //false
        System.out.println("문자열이 비어 있거나 공백인지? : " + "            ".isBlank()); //true

        char c = str.charAt(7);//J
        System.out.println("7번 인덱스의 문자"+ c);
    }
}
