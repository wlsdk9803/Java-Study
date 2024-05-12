package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        // 이게 객체지향
        
        ValueData valueData = new ValueData();
        valueData.add(); // x002(valueData의 예시 값)에 접근해서 해당 인스턴스의 add() 호출
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }
}