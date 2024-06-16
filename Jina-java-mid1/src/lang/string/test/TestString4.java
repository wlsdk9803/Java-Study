package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        // 코드 작성
        String filename = str.substring(0, 5);
        String extname = str.substring(5);

        System.out.println("filename = " + filename);
        System.out.println("extname = " + extname);
    }
}
