package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //bigData 인스턴스 속성인 Data 클래스내부 int value에 접근할 수 있는 참조값 생성
        System.out.println("bigData 참조값: " + bigData);
        System.out.println("bigData.data 참조값: " +bigData.data);
        //즉, 기본형 변수와 다르게 참조형 변수는 null로 초기화되며,
        //값을 직접 보관하는 기본형 변수와 다르게 주소값을 통해 실제 메모리에 접근하기 위한 변수임

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " +bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value);

    }

}
