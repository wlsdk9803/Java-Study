package oop1;

public class ValueData {
    int value;

    // 여기에서는 static이 안붙음!
    void add(){
        value++; // 이때 value에 접근할 때는 기본으로 본인 인스턴스에 있는 멤버변수에 접근
        System.out.println("숫자 증가 value = " + value);
    }
}
