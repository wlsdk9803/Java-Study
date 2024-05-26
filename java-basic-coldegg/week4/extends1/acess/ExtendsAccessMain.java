package week4.extends1.acess;

import week4.extends1.acess.child.Child;
import week4.extends1.acess.parent.Parent;

public class ExtendsAccessMain {

    public static void main(String[] args) {

        Child child = new Child();
        child.childMethod();
        //public,protected 호출, default 호출X
        //**error: child클래스의 인스턴스가 다른 패키지인 parent클래스의 default 메소드를 호출했으므로 불가능
        child.parentMethod();
        //1. child클래스의 인스턴스가 다른 패키지인 parent클래스의 public 메소드를 호출
        //2. privatemove, defaultmove 메소드를 호출하는 장소가 parent클래스이므로 가능한 것

        child.parentvalue();
        child.childvalue();
        child.parentvalue();


    }
}
