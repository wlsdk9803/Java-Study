package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str= "100";

        //String -> Integer
        //문자를 숫자로 바꾸는 건 오토 박싱이 안됨..
        //완전 다른 타입 간의 전환이라
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer1 -> int
//        int intValue = integer1.intValue();
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        //int => Integer
//        Integer integer2 = Integer.valueOf(intValue);
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);

    }
}
