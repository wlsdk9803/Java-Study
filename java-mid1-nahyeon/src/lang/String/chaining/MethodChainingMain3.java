package lang.String.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        //반환된 참조값을 새로운 변수에 담아서 보관하지 않고, 대신에 바로 메서드 호출에 사용
        int result = adder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);
    }
}
