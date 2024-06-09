package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmutableMyDate withYear(int year){ // 불변 객체의 메서드가 'with'로 이름 지어진 경우, 그 메서드가 수정사항을 포함하는 객체의 새 인스턴스를 반환한다. // 관례처럼 사용됨 // 정리하면 'set'은 내 것을 바꿀 때 사용되고, 'with'는 기존 것을 수정하여 새로운 것을 반환한다는 뜻!
        int newYear = year;
        return new ImmutableMyDate(newYear, month, day);
    }
    public ImmutableMyDate withMonth(int month){
        int newMonth = month;
        return new ImmutableMyDate(year, newMonth, day);
    }
    public ImmutableMyDate withDay(int day){
        int newDay = day;
        return new ImmutableMyDate(year, month, newDay);
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
