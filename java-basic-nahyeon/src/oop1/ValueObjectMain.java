package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        //ValueObject 인스턴스에 있는 add() 메서드를 호출한다.
        //add 메서드 내부에서 접근하는 value는 인스턴의 멤버 변수 value이다.

        System.out.println("최종 숫자= " + valueObject.value);
        //따라서 valueObject가 참조하는 인스턴스의 멤벼 변수 value를 출력하면
        //연산이 완료된 value의 값 3이 출력된다.
    }
}
