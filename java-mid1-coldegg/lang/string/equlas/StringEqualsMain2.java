package lang.string.equlas;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hu"); //x001
        String str2 = new String("hu"); //x002
        System.out.println("메소드 호출 비교1: "+isSame(str1,str2));

        String str3 = "hi";
        String str4 = "hi";
        System.out.println("메소드 호출 비교2: "+isSame(str3,str4));

    }

    private static boolean isSame(String x, String y){
        return x==y;
    }
}
