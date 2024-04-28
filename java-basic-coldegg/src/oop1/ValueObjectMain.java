package oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueData v1 = new ValueData();
        v1.add();
        v1.add();
        v1.add();
        System.out.println("인스턴스 변수인 value의 값 = " + v1.value);
        System.out.println("static 변수인 value2의 값 = " + v1.value2);

    }

}
