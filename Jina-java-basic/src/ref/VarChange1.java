package ref;

public class VarChange1 {
    public static void main(String[] args) {
        // 결과 예상
        // a = 10, b = 10
        // 변경 a = 20
        // a = 20, b = 10
        // 변경 b = 30
        // a = 20, b = 30

        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
