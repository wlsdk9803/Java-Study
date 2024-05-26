package week4.extends1.acess.child;

import week4.extends1.acess.parent.Parent;


//자식 인스턴스에서 자식클래스에 정의된 메소드를 호출할 때, 부모클래스에 정의된 public, protected(상속관계허용)에만 접근할 수 있다.
//그러나 자식 인스턴스에서 부모클래스에 정의된 메소드 호출을 통해 부모클래스에 정의된 모든 정보에 접근할 수 있다.


public class Child extends Parent {

    public void childMethod(){
        publicmove();
        protectedmove(); //상속관계허용
        //defaultmove();
    }

    int val1 = 2; //이 때 val1은 부모클래스의 변수를 재정의..?
    //만약 재정의가 맞다면, 자식 클래스에서 parent 메소드를 호출했을 때, 동일한 이름의 val3, val4가 부모 클래스에서 정의된 값이 아니라 자식 클래스의 값으로 출력되어야 함
    int val3 = 2;
    int val4 = 2;

    public void childvalue(){
        val2 = 1;
        //하지만 parentvalue() 출력결과: 전부 0으로 parent의 값이 나온다
        //즉, 재정의가 아닌 그냥 이름이 같은 각각의 변수
        //아래 childvalue() 출력결과: val1,val4는 위에서 만든 인스턴스 > child 내부에 존재하는 값이고, val2는 인스턴스 > parent 내부에 존재하는 값이 호출된 것
        System.out.println("child 자신의 퍼블릭 값: "+val1); //2
        System.out.println("상속받은 프로텍티드 값: "+val2); //1
        System.out.println("child 자신의 프라이빗 값: "+val4); //2


    }

    public void privatemove(){
        System.out.println("Parent.prviatemove에 접근불가하므로 재정의 할 수 없어야 함");
        //Q. 하지만 된다..! 뭐지 => A. 이는 오버라이딩한 게 아니라, 그냥 메소드 이름이 동일한 다른 메소드였다.
        //위의 동일한 이름의 변수와 마찬가지로, 정상적으로 "오버라이딩" 했다면 부모 클래스에서 동일 이름의 메소드를 호출해도, 부모 메소드가 아니라 오버라이딩된 자식의 메소드가 호출되어야 한다.
        //따라서 여기서 만든 privatemove는 부모의 private 메소드와는 전혀 관련없음
    }

}
