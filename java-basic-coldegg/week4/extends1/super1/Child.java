package week4.extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child의 hello");
    }

    public void call(){
        System.out.println("this value = " + value);
        //인스턴스 내부에 value가 두개가 있다. 부모의 value와 자식의 value
        //this를 쓰든안쓰든 자기 자신의 타입부터 확인하는데 값이 있으므로 부모 타입을 확인할 필요가 없게 되는 게 맞는지?
        //왜냐하면 this.는 참조값을 통해 인스턴스 내부로 접근하는 키워드로 알고있는데
        //그 인스턴스 내부에는 다시 부모와 자식 클래스 정보 모두 존재하니까..??
        //결국 this를 쓰든 안쓰든 차이가 없는 것 같다
        System.out.println("super value = "+ super.value);

        hello();
        super.hello();
    }

}
