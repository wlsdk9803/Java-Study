package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
// 기본형을 래퍼 클래스로 변환하거나 래퍼 클래스를 기본형으로 변환하는 일 빈번
// => 자바1.5부터 오토 박싱, 오토 언박싱 지원
