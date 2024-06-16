package lang.string.builder;

// 메서드 체이님 기법으로 개선
public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                        .insert(3, "Java")
                        .delete(4, 8)
                        .reverse()
                        .toString();
        System.out.println("string = " + string);
    }
}