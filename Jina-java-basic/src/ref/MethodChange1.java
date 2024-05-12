package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        // 결과 예상
        // 메서드 호출 전: a = 10
        // 메서드 호출 후: a = 10 // changePrimitive 내의 x 값만 바뀌지 a 값은 바뀌지 않음

        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }
    static void changePrimitive(int x){
        x = 20;
    }
}