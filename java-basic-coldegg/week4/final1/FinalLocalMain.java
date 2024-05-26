package week4.final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int local;
        local = 10;
        //data1 = 20; //error: final 선언은 변수를 수정할 수 없다는 의미

        method(10); //error
        //복습: 메인 메소드는 static 메소드이므로 static 메소드만 호출 가능
    }

    static void method(final int param){
        //param = 20; //error: final 매개변수도 수정될 수 없음
    }


}
