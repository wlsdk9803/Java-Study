package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        // 여기서는 value와 비교 대상 값을 비교할 때 compareTo()라는 외부 메서드를 사용한다.
        // 근데 항상 자기 자신의 값인 value가 사용된다.
        // 따라서 만약 value가 객체라면 value 객체 스스로 자기 자신의 값과 다른 값을 비교하는 메서드를 만드는 것이 더 유용할 것이다.
        // => 래퍼클래스 (특정 기본형을 감싸서 만드는 클래스)
    }
    public static int compareTo(int value, int target){
        if(value < target) return -1;
        else if(value > target) return 1;
        else return 0;
    }
}
