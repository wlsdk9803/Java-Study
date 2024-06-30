package lang.String.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("adder " + adder); //@3f99bd52 넷 다 같은 참조값을 가짐 (this를 반환하므로)
        System.out.println("adder1 " + adder1);
        System.out.println("adder2 " + adder2);
        System.out.println("adder3 " + adder3);
    }
}
