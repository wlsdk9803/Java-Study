package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);//숫자, 래퍼 객체 변환 (숫자, 문자열 모두 지원)
        Integer i2 = Integer.valueOf("10"); //문자열, 래퍼 객체 변환
        int intValue = Integer.parseInt("10");//문자열 전용, 문자열을 기본형 변환

        //비교
        int compareResult = i1.compareTo(20); //내 값과 인수로 넘어온 값 비교
        System.out.println("compareResult = " + compareResult);

        //산술 연산
        //3개 다 static 메서드
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
