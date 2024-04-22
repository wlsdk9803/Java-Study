package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); //그냥 10 똑같음
        //메서드 호출 시 사용하는 파라미터(매개변수)도 결국 복사해서 전달되기 때문에
        //main에 있는 a를 출력하면 그대로일 것이다..
    }
    static void changePrimitive(int x) {
        x = 20;
    }
}