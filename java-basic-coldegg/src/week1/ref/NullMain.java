package ref;

public class NullMain {
    public static void main(String[] args) {
        Data data = null; //1. 내가 정의한 Data라는 (클래스)데이터 타입에 data 인스턴스를 생성할 건데, 초기값 주소를 따로 null로 지정하겠다.
        System.out.println("1. data = " + data);
        data = new Data(); //2. 이미 생성된 data 인스턴스를 다시 초기화하여 자동 주소값 생성
        System.out.println("2. data = " + data);
        data = null; //3. 다시 주소값을 null로 지워버림
        System.out.println("3. data = " + data);
    }
}
