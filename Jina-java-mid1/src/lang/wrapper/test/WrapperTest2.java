package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        // 코드 작성
        double sum = 0;
        for (String strnum : array) {
            sum += Double.parseDouble(strnum);
        }
        System.out.println("sum = " + sum);
    }
}
