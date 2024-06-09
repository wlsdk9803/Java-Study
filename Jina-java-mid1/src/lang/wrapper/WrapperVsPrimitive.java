package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정. 10억
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i=0; i<iterations; i++){
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");
    
        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i=0; i<iterations; i++){
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");
    }
}
// 기본형 연산이 래퍼 클래스보다 훨씬 빠르다.
// why? 기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지하는데, 래퍼 클래스의 인스턴스는 내부에 필드로 가지고 있는 기본형 값 뿐만 아니라, 객체 자체를 다루는데 필요한 객체 메타데이터를 포함하므로 더 많은 메모리를 사용한다.
// 하지만 1회 연산일 때는 둘 다 매우 빠르게 수행되므로, 연산을 아주 많이 하는 경우라면 기본형으로 최적화, 그렇지 않다면 유지보수하기 더 나은 것을 선택하면 된다.

// 유지보수 vs 최적화를 고려해야 하는 상황이라면 유지보수하기 좋은 코드를 먼저 고민한다.