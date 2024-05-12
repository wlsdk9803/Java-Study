package ref;

public class NullMain3 {
    public static void main(String[] args) {
        // 결과 예상
        // bigData.count = 0
        // bigData.data = null // 참조형의 초기 값은 null
        // bigData.data.value // 여기에서 NullPointerException가 발생할 것이라 생각

        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
