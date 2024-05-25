package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent(); // 메모리 상에 부모만 생성되고 자식타입은 생성되지 않음.
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        // 메모리 상에 Child 자체가 존재하지 않는데...? => Child 자체 사용 불가
        child2.childMethod(); // 실행 불가

        // 업캐스팅이 안전한 이유
        // 객체를 생성하면 해당 타입의 부모 타입도 모두 같이 생성된다. 즉, 업캐스팅은 메모리 상에 인스턴스가 모두 존재하기 때문에 항상 안전해서 캐스팅 생략 가능

        // 다운캐스팅이 위험한 이유
        // 인스턴스에 존재하지 않는 하위타입으로 캐스팅하는 문제가 발생할 수 있음.
    }
}
