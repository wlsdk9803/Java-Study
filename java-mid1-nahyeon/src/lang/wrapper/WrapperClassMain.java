package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        //문자열 풀처럼 자바가 미리 만들어 놓고(캐싱) 성능 최적화 도와줌
        System.out.println("newInteger = " + newInteger.toString());
        System.out.println("integerObj = " + integerObj);

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
         int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj)); //둘다 valueOf으로 만들었다면 true가 됨
        System.out.println("equals: " + (newInteger.equals(integerObj)));

    }
}
