package lang.immutable.address;

public class ImmutableAddress {
    private final String value; // 내부 값 변경 불가능하게 final 설정

    public ImmutableAddress(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
