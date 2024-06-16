package lang.String.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this; // 나의 참조 반환하기..
    }

    public int getValue() {
        return value;
    }
}
