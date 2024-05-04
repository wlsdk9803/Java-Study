package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count); // 1

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count); // 2

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count); // 3 // counter 인스턴스의 count를 같이 공유하기 때문에 값이 계속 올라감
        // 하지만 이건 Data2의 인스턴스가 몇 개 생성된 건지 알고 싶은건데, 그것과 무관하게 Counter라는 클래스를 만들어서 가져와야 한다는 불편함이 존재한다.
        // 공용 변수를 만들 수 있는 방법은 없을까...?
        // => static 변수
    }
}
