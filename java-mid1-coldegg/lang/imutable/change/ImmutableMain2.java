package lang.imutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj1_add = obj1.add(20);
        //불변 객체에서 변경과 관련된 메소드는 반환값으로 나오기 때문에, 메소드만 호출할 분 아니라 꼭 반환값을 받아줘야 한다.

        System.out.println(obj1.getValue());
        System.out.println(obj1_add.getValue());
    }
}
