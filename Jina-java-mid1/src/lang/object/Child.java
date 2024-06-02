package lang.object;

public class Child extends Parent{ // 명시적으로 상속을 받았기 때문에 Obejct를 상속받지 않음
    public void childMethod(){
        System.out.println("Child.childMethod");
    }
}
