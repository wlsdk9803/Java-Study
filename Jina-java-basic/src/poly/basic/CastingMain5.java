package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("Parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent){
        parent.parentMethod();
        if(parent instanceof Child){ // instanceof 키워드는 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우에도 true 반환 // parent2 instanceof Parent도 true
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
