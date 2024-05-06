package week3.src.access.b;

import week3.src.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        //디폴트부터는 패키지가 다르면 호출 불가능
        //단, 디폴트는 상속 관계에 있는 것은 호출 가능하다.
//        data.defaultField = 2;
//        data.defaultMethod();

//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();

    }
}
