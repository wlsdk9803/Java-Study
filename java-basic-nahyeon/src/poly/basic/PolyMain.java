package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
    //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();
        //Parent 인스턴스 생성, 메모리 상에 Parent만 생성 (자식은 생성되지 않는다!!)
        //생성된 참조값은 parent 변수에 저장

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        //메모리 상에 child와 parent가 모두 생성된다.
        //생성된 Child 참조값을 Child타입 변수인 child에 담아준다


        //부모 변수가 자식 인스턴스를 참조하는 경우(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();//부모 타입은 자식을 참조할 수 있다.
        poly.parentMethod();
//        poly.childMethod();
        //메모리 상에 Child, Parent 둘 다 생성 (Child 인스턴스를 만들었기 때문)
        //단, 생성된 참조값은 Parent 타입 변수인 ploy에 담아둔다.

        //부모 타입은 자식 타입을 담을 수 있다.
        //자식 타입은 부모 타입을 담을 수 없다
//        Child poly1 = new Parent(); //컴파일 에러
    }
}
