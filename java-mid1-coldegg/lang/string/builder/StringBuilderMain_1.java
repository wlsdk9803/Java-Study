package lang.string.builder;

public class StringBuilderMain_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb;

        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = "+sb);

        sb.insert(4,"java");
        System.out.println("insert= "+sb);

        sb.delete(4,8);
        System.out.println("Delete=" +sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //가변으로 쭉 바꾸다가 마지막에 불변으로 고정
        System.out.println(sb);
        System.out.println(sb2); //sb2도 함께 변했음
        String string = sb.toString();
        System.out.println("string = " + string);
        String string2 = sb2.toString();
        System.out.println("string2= " + string2);
        System.out.println(string);
        System.out.println(string2);
    }
}
