package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단, 자식의 기능은 호출할 수 없다. 컴파일에러
//        poly.childMethod();

        //다운캐스팅 (부모타입->자식타입)
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
        //연산자 우선순위에 따라 소괄호로 poly 전체를 감싸주어 사용한다.
    }
}
