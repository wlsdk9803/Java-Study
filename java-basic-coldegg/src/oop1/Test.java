package oop1;

public class Test {
    public static void main(String[] args) {
        ValueData vtest = new ValueData();
        System.out.println("인스턴스의 value값 증가 : " + vtest.value);
        vtest.add_test(vtest.value);
        System.out.println("인스턴스의 value값 증가 : " + vtest.value);
    }
}
