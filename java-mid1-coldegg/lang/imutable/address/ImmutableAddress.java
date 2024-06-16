package lang.imutable.address;

public class ImmutableAddress {
    // setValue를 없애고, final로 좀 더 의도를 명확히 함
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
