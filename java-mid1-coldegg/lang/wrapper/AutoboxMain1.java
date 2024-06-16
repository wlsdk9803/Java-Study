package lang.wrapper;

public class AutoboxMain1 {
    public static void main(String[] args) {
        //기본형 -> 참조형
        int value = 7;
        //Inter 클래스의 하나의 객체로 value값을 넣어 생성
        Integer boxedValue = Integer.valueOf(value);

        //참조형 -> 기본형
        int unboxvalue = boxedValue.intValue();

        System.out.println("unboxvalue = " + unboxvalue);
        System.out.println("boxedValue = " + boxedValue);
    }
}
