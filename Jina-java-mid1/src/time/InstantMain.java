package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();
        System.out.println("now = " + now); // UTC 기준 => 한국에서는 지금 시각에서 9시간 뺀 시간이 출력됨

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0); // 1970년 1월 1일으로부터 0초만큼 더한다.
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
// Instant: epoch 시간으로부터 흐른 시간을 초 단위로 저장
// 전세계 모든 서버 시간을 똑같이 맞출 수가 있음