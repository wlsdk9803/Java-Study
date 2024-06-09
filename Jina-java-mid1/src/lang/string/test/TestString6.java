package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 코드 작성
        int idx = str.indexOf(key);
        int count = 1;
        while(true){
            idx = str.indexOf(key, idx + 1);
            count++;
            if(idx == str.lastIndexOf(key)) break;
        }
        System.out.println("count = " + count);
    }
}
