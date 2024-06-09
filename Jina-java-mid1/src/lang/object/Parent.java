package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
public class Parent { // 'extends Object'가 생략된 것 // Object는 모든 객체를 담을 수 있는 최상위 부모
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
