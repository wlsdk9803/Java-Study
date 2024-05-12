package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;
        System.out.println("data = " + data.value);
        //Cannot assign field "value" because "data" is null
        //자바화들짝
    }
}