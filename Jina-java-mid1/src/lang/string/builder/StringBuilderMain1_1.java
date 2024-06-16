package lang.string.builder;

// 불변 String을 사용하면 사용되지 않는 객체를 계속 생성한다는 문제점 발생
// 따라서 이를 해결하기 위해 자바는 StringBuilder라는 가변 String 제공
// 사이드 이펙트에 유의할 것
public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(3, "Java");
        System.out.println("insert = " + sb); // ABCJavaD

        sb.delete(4, 8);
        System.out.println("delete = " + sb); // ABCJ

        sb.reverse();
        System.out.println("reverse = " + sb); // JCBA

        //StringBuilder -> String // 가변 -> 불변
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
