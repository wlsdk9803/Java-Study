package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");

        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");

        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");

        System.out.println("C count = " + data3.count);

        // 당연히 기대한 대로 작동하지 않는다.
        // 새 인스턴스를 생성할 때마다 count의 값은 0으로 초기화 된다. (아예 새로운 힙 영역)

        //인스턴스에 사용되는 멤버 변수 `count` 값은 인스턴스끼리 서로 공유되지 않는다.

    }
}
