package lang.String.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println("sb = " + sb);

        sb.insert(4, "JAVA");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete  = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder (가변) => String (불변으로 바꾸기 ㄱㄴ)
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
