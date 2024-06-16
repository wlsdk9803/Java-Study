package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder(); //x001
        ValueAdder adder1 = adder.add(1); //x001.add(1) => x001 return
        ValueAdder adder2 = adder1.add(2); //x001.add(2) => x001 return
        ValueAdder adder3 = adder2.add(3); //x001.add(3) => x001 return
        int result = adder3.getValue(); //x001.getValue() => 6
        System.out.println("result = " + result);
    }
}
