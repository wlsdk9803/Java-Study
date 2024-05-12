package ref;

public class NullMain3 {
    public static void main(String[] args) {

        BigData bigData = new BigData();

        System.out.println("bigData.count = " + bigData.count); // 숫자 초기값 0
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        // 참조형 멤버변수의 초기값은 null이기 때문이다.
        System.out.println("bigData.data.value" + bigData.data.value); //null.value
    }
}
