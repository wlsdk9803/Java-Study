package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정. 대신 valueOf() 사용
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용. 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj)); // false
        // 만약 Integer newInteger = new Integer(10); 이 부분이
        // Integer newInteger = Integer.valueOf(10); 이렇게 바뀐다면 true가 된다.
        // why? 미리 만들어두고 재사용하니까!
        System.out.println("equals: " + (newInteger.equals(integerObj))); // true
    }
}
// 래퍼 클래스 생성: 박싱(Boxing)
// intValue(): 언박싱(Unboxing)