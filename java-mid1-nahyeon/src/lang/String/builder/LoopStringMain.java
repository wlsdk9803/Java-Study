package lang.String.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("hello java");
        }

        long endTime = System.currentTimeMillis(); //현재 밀리초
        String r = sb.toString();
        System.out.println("result = " + r);
        System.out.println("time = " + (endTime - startTime) + "ms"); //time = 4ms (stringbuilder 사용시)
        //time = 2637ms
        //개오래걸림
    }
}
