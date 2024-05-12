package week4.final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        //생성자에서 초기화된 final 변수 출력
        ConstructInit inst1 = new ConstructInit(10); //인스턴스 변수 생성 및 매개변수 생성자 호출
        System.out.println(inst1.instvalue);

        //필드에서 초기화된 final 변수 출력
        FieldInit inst2 = new FieldInit(); //인스턴스 변수 생성 및 디폴트 생성자 호출
        System.out.println(inst2.instvalue);

        //필드에서 초기화된 static 변수 출력
        System.out.println(FieldInit.CONST_VALUE);
    }

}
