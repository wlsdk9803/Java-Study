package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }
    public void call(){
        System.out.println("this.value = " + this.value);
        System.out.println("super.value = " + super.value); // this는 자기자신, super는 부모 // this 생략 가능 (생략하면 먼저 자기자신에서 찾고, 없으면 부모에서 찾는다.)
        // 이름이 같아도 부모 것을 호출하고 싶으면 super 사용

        this.hello();
        super.hello();
    }
}
