package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // -1 // 못찾았을 때의 return 값이 첫번째 값과 같네...? // 숫자 아닌 다른 값이 필요하겠는데... => null 필요
    }
    private static int findValue(int[] intArr, int target){
        for (int value : intArr) {
            if(value == target) return value;
        }
        return -1;
    }
}
// 기본형은 항상 값을 갖는다. (초기화를 안해도 될 경우에도 default 값은 0)
// 그런데 때로는 데이터가 '없음'이라는 상태가 필요할 수 있다.