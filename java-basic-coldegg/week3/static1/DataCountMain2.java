package week3.src.static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter(); //counter는 참조값 c001대입, c001(counter).count = 0으로 초기화
        Data2 data = new Data2("A", counter); //data는 참조값 d001대입, d001.name="A", c001.count = 1이 됨
        System.out.println("A count = " + counter.count);
        System.out.println("data의 참조값은 " + data);
        System.out.println("counter의 참조값은 " + counter);

        Data2 data2 = new Data2("B", counter); //data2는 참조값 d002대입, d002.name="B", c001.count = 2가 됨
        System.out.println("B count = " + counter.count);
        System.out.println("data2의 참조값은 " + data2);
        System.out.println("counter의 참조값은 " + counter);

    }
}
