package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values(); //모든 상수 학목 배열로 받을 수 있음

        // 모든 enum 반환
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("value.name() = " + value.name() + ", ordinal = " + value.ordinal()); //순서도 가능
        }

        //String -> enum 변환, 잘못된 문자면 IllegalArgumentException 예외 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); //toString 오버라이딩 가능
    }
}
