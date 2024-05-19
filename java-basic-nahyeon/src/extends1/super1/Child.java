package extends1.super1;

public class Child extends Parent {
    public String value = "Child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);
        System.out.println("super value = " + super.value); // 나의 부모 타입에서 value 필드 찾기
        System.out.println("value = " + value); // 생략하면 현재 타입부터 찾기

        this.hello(); //따라서 this 생략 가능
        super.hello();
    }
}
