package oop1;

public class ValueObject {
    //데이터와 데이터를 다루는 기능도 클래스에 함께 포함해서 새로운 클래스를 정의
    //필드 + 메서드
    int value;

    // 원칙적으로 메서드는 객체를 생성해야 호출 가능
    // 지금까지의 예시는 static 키워드를 사용해 객체를 생성하지 않고도 메서드를 사용한 것임
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
