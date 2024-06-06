package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj) {//Object를 받으므로 어떤 클래스 참조변수든 다 받을 수 있다.
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }
}
