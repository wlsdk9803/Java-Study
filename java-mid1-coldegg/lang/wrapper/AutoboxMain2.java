package lang.wrapper;

public class AutoboxMain2 {
    public static void main(String[] args) {
        //기본형 -> 참조형
        int value = 7;
        //Inter 클래스의 하나의 객체로 value값을 넣어 생성
        Integer boxedValue = value; //오토 박싱

        //참조형 -> 기본형
        int unboxvalue = boxedValue; //오토 언박싱

        System.out.println("unboxvalue = " + unboxvalue);
        System.out.println("boxedValue = " + boxedValue);
    }
}
