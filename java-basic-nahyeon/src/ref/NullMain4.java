package ref;

public class NullMain4 {
    public static void main(String[] args) {

        BigData bigData = new BigData();
        bigData.data = new Data(); //참조형 멤버변수에 Data 객체의 참조값을 주면 됨

        System.out.println("bigData.count = " + bigData.count); // 숫자 초기값 0
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        // 참조형 멤버변수의 초기값은 null이기 때문이다.
        System.out.println("bigData.data.value = " + bigData.data.value); //null.value
    }
}
