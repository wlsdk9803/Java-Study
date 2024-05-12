package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
        
        // 우리가 인스턴스가 필요한 이유는 멤버 변수 때문인 것이 큰데. 이 경우는 멤버 변수도 없고 단순히 기능만 제공함
        // 근데 왜 굳이 객체를 생성해야 할까...?
        // => static 메서드
    }
}
