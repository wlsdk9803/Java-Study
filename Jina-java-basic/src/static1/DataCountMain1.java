package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count); // 1
        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count); // 1
        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count); // 1
        // 생성되는 객체의 수를 세고 싶었지만 당연히 의도대로 작동하지 않음
        // 왜냐? 각 인스턴스마다 count 변수가 새로 생기니까...! 즉, 인스턴스끼리 변수를 공유하지 않는다는 소리
        // => 의도대로 하고 싶으면 변수를 공유해야 함
    }
}
