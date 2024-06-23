package time;

import java.time.LocalDate;

// Local~: 특정 지역의 날짜와 시간만 고려할 때 사용
public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산(불변)
//        ofDate.plusDays(10);
//        System.out.println("지정 날짜 + 10d = " + ofDate);; // 여전히 '2013-11-21'이 출력됨. why? 불변이니까...! => 반환 값 받아서 변수에 넣어야 함
          ofDate = ofDate.plusDays(10);
          System.out.println("지정 날짜 + 10d = " + ofDate);; // 2013-12-01


    }
}
