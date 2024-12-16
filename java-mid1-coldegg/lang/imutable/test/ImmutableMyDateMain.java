package lang.imutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = "+date1); //x001: 2024-1-1
        System.out.println("date2 = "+date2); //x001: 2024-1-1

        System.out.println("2025년");
//        date1.setYear(2025);
        //반환값(새로생성된참조값)을 다시 date1에 대입
        date1 = date1.withYear(2025); //x002: 2025-1-1
        System.out.println("date1 = "+date1);
        System.out.println("date2 = "+date2);

    }
}
