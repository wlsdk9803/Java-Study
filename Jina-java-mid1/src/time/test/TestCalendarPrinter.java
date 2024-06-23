package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

// 모르겠어서 정답 참고함...
public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();


        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        System.out.println("Su Mo Tu We Th Fr Sa");
        LocalDate firstDay = LocalDate.of(year, month, 1);
        int firstDayWeekInt = firstDay.getDayOfWeek().getValue() % 7;
        for(int i=0; i<firstDayWeekInt; i++) System.out.print("   ");

        LocalDate nextMonth_firstDay = firstDay.plusMonths(1);
        LocalDate dayIter = firstDay;
        while(dayIter.isBefore(nextMonth_firstDay)){
            System.out.printf("%2d ", dayIter.getDayOfMonth());
            if (dayIter.getDayOfWeek() == DayOfWeek.SATURDAY) System.out.println();
            dayIter = dayIter.plusDays(1);
        }
    }
}
