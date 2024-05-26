package oop1;

public class ValueDataMain {

    public static void main(String[] args) {
        ValueData v1 = new ValueData();
        add(v1);
        add(v1);
        add(v1);
        System.out.println("최종숫자 = " + v1.value);

    }

   static void add(ValueData param) { //데이터타입과 매개변수를 정의한 것
        param.value++; //param은 지역변수지만, 주소값이 복사되어 주소값.value로 실제 value값에 접근하게 됨 (섹션2의 기본형vs참조형 참고)
        System.out.println("숫자 증가 value = " + param.value);
   }

}
