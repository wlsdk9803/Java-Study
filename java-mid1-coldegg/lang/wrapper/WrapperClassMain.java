package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInt = new Integer(10); //삭제 예정, 대신에 valueOf()를 사용해라.
        Integer intObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInt = " + newInt);
        System.out.println("doubleObj = " + doubleObj);
        System.out.println("longObj = " + longObj);
        System.out.println("IntObj = " + intObj);

        System.out.println("내부 값 읽기");
        int intValue = intObj.intValue(); //10
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue(); //100
        System.out.println("longObj = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInt == intObj)); //false (다른 참조값)
        System.out.println("equals: " + newInt.equals(intObj)); //true (내부값)
    }
}
