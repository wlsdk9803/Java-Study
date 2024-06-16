package lang.imutable.address;

public class PrimitiveMain {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
//      a와 b는 전혀 다른 변수. b가 a를 복사해서 대입하는것.
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        b=20;
        System.out.println("20->b");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
