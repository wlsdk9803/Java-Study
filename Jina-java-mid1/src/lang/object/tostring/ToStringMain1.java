package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string);
        // toString()은 객체의 클래스 포함 이름 + @ + 객체의 참조값 반환
        // 즉, toString()은 클래스 정보와 참조값만 제공할뿐 객체의 상태를 적절히 나타내지는 못함 => toString()을 재정의, 즉 오버라이딩 하는 것이 일반적

        // object 직접 출력
        System.out.println(object);
        // println()은 내부에서 toString()을 호출한다. // 따라서 toString()을 사용할 필요가 없는 것!
    }
}
