package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);

        // 같은 Counter 인스턴스에 있는 count에 접근하므로 기대하는 방식으로 동작한다.
        // 결과적으로 `Data2` 의 인스턴스가 3개 생성되고, `count` 값도 인스턴스 숫자와 같은 3으로 정확하게 측정된다.


        // Data2 클래스의 인스턴스 개수를 알고 싶은건데, 별도의 Counter 클래스를 만들어 사용해야 함 -> 불편함
        // 생성자가 복잡해진다.
    }
}
