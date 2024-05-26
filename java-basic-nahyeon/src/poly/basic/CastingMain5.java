package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child) { //instanceof를 사용해서 원하는 타입으로 변경이 가능한지 확인한 다음에 다운캐스팅을 수행하는 것이 안전
            //Child로부터 생성된 인스턴스면
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent; // 다운캐스팅 하고
            child.childMethod(); //메서드 호출
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    } //매개변수로 넘어온 참조형 변수 parent가 참조하는 타입에 따라 다른 명령을 수행한다.
}
