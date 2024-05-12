package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        // 데이터인 value와 기능인 add 메서드가 서로 분리되어 있음
        // 클래스 내부에 멤버변수와 메서드를 함께 넣자...! => 이렇게 되면 객체지향(valueObjectMain)

        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자 = " + valueData.value);
    }

    // 메서드 앞에 static이 붙으면 객체를 생성하지 않고도 메서드 호출 가능
    // 원래는 객체를 생성해야 메서드를 호출할 수 있음
    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}