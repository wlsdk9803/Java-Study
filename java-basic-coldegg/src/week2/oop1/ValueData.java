package oop1;

public class ValueData {

    int value;
    static int value2;

    void add() {
        value2++;
        System.out.println("인스턴스의 value값 증가 : " + value);
    }

    void add_test(int value) {
        value++;
        System.out.println("매개변수의 value값 증가 : " + value);
    }

}
