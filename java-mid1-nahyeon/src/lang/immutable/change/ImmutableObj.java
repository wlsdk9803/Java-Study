package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add (int addValue) {
//        return new ImmutableObj(value + addValue);

        int result = value + addValue;
        return new ImmutableObj(result);
        //숫자를 더한 결과를 가지는 새로운 불변객체를 리턴한다.
    }
}
