package access.ex;

public class MaxCounter {
    private int count;
    private int max; // 속성은 다 숨기기

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
//        if (count < max){
//            count++;
//        } else {
//            System.out.println("최대값을 초과할 수 없습니다.");
//        }

        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        // 실행 로직
        count++;

        // 위에서 여러가지 검증 로직을 실행하는 경우 검증 불통 -> 리턴으로 빼기
        // 통과 시 아래 실행 로직이 실행되도록 코드를 명확하게 분리하는 방법도 좋다
    }

    public int getCount(){
        return count;
    }
}
