package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1(); // deco라는 기능은 멤버 변수도 없고, 단순히 기능만 제공할 뿐이다.
        //인스턴스가 필요한 이유는 멤버 변수(인스턴스 변수)등을 사용하는 목적이 큰데, 사용하는 멤버 변수가 없다!

        //객체가 굳이 필요하지 않은데 힙 영역에 utils 생성 -> 메서드 호출 (낭비임)
        String deco = utils.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
