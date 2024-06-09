package lang.object.tostring;

public class toStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string); //java.lang.Object@2a84aee7
        //클래스에 대한 정보@참조값

        //object 직접 출력
        System.out.println(object); ////java.lang.Object@2a84aee7
    }
}
