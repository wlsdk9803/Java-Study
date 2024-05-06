package week3.src.static2;

import static week3.src.static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {

        System.out.println("1.정적 호출");
        staticCall();

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        staticCallbyIns(data2);

        DecoData data3 = new DecoData();
        data3.staticCall(); //인스턴스로 클래스 메소드를 호출할 수는 있으나, 코드상 해석이 혼동되기 때문에 사용하지 않음
        staticCall();

    }


}