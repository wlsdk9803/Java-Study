package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();//문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod(); // java.lang.ClassCastException
        //실행 불가 -> 런타임 오류 ClassCastException

        // 인스턴스에 Child가 만들어진 적이 없음
    }
}
