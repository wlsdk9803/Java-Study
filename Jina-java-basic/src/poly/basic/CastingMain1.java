package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다. 컴파일 에러
        // poly.childMethod();

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        //Child child = poly; // 컴파일 에러 (자식은 부모를 담을 수 없음)
        Child child = (Child) poly; // 참조값(x001)을 복사해서 불러들인 다음, 자식 타입으로 지정 // Parent poly의 타입이 변하는 것은 아님!
        child.childMethod();
        // 하지만 이렇게 다운캐스팅 결과를 변수에 담아두는 과정이 번거로움...
        // 이런 과정 없이 일시적으로 다운캐스팅을 해서 하위 클래스의 기능을 바로 호출할 수 있다면?

        // 캐스팅 - 업캐스팅(부모타입으로) & 다운캐스팅(자식타입으로)
    }
}
