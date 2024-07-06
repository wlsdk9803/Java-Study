package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE); //  LocalDate는 날짜 정보만 가지고 있고, 분에 대한 정보는 없어서 분에 대한 정보를 조회하려고 하면 예외 발생
        System.out.println("minute = " + minute); // 컴파일 에러
    }
}
