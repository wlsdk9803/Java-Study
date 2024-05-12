package static2;

public class DecoUtil2 {
    public static String deco(String str) { //static 메서드 deco
        String result = "*" + str + "*";
        return result;
    } // 이렇게 하면 객체를 메모리에 올리지 않고도 해당 메서드를 사용할 수 있다
}
