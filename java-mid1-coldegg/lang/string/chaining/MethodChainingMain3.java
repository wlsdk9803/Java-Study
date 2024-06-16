package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        //메소드 체이닝이란,
        //참조값을 반환시켜서 꼬리처럼 메소드를 호출하는 방식
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
