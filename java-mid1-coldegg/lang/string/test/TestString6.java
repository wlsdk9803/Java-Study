package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key); //6 => hello시작지점, 못찾으면 -1 반환
        while (index >= 0) {
            index = str.indexOf(key, index + 1); //한 번 찾고 끝나면 index+1부터 다시 찾음
            count++;
        }
        System.out.println("count = " + count);
    }
}
