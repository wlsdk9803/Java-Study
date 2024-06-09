package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }
    public ImmutableObj add(int addValue){
        int result = value + addValue; // 기존의 value는 절대 바꾸지 않음
        return new ImmutableObj(result); // 새로운 객체를 만들어서 반환
    }
    public int getValue() {
        return value;
    }
}
