package week4.extends1.acess.parent;

public class Parent {

    public int val1;
    protected int val2;
    int val3;
    private int val4;

    public void publicmove(){
        System.out.println("publicmove");
    }
    protected void protectedmove(){
        System.out.println("protectedmove");
    }
    void defaultmove(){
        System.out.println("defaultmove");
    }
    private void privatemove(){
        System.out.println("privatemove");
    }

    public void parentMethod(){
        defaultmove();
        privatemove();
    }

    public void parentvalue(){
        System.out.println("==Parent클래스 확인==");
        System.out.println("퍼블릭 연료: " + val1);
        System.out.println("프로텍티드 바퀴의 개수: " + val2);
        System.out.println("디폴트 주행제어기: " + val3);
        System.out.println("프라이빗 메모리칩: " + val4);
    }


}
