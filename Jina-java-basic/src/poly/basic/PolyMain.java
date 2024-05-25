package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent(); // 메모리에 부모 인스턴스만 생성됨
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child(); // 메모리에 부모와 자식 인스턴스 모두 생성
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        // **부모는 자식을 담을 수 있다.** (자식타입은 부모타입을 담을 수 없다.)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 메모리에 부모와 자식 인스턴스 모두 생성 // 생성된 참조값을 Parent 타입의 변수인 poly에 저장
        poly.parentMethod();
        
        // Child child1 = new Parent(); // 컴파일 에러 (자식은 부모를 담을 수 없다.)

        // 자식의 기능은 호출할 수 없다. 컴파일 에러 발생
        // poly.ChildMethod(); // poly는 Parent 타입이므로 컴파일 에러
    }
}
