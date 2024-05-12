package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // 따로 초기화 값 지정 x 이므로 0
        System.out.println("value2 = " + data.value2); // 10
    }
}
