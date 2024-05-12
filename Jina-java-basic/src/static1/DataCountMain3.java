package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count); // 1
        // count 변수에 접근할 때 'data1.count', 'data2.count'처럼 인스턴스의 변수에 접근하는 것이 아니라 'Data3.count'와 같이 클래스에 직접 접근한다.

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count); // 2

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count); // 3
        // static이 붙은 정적 변수는 메서드 영역에서 관리 (힙 영역 X)
        // => 공용으로 관리한다는 뜻

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 인스턴스를 통해 접근했다가 static 변수임을 확인하고 메서드 영역으로 접근
        // 하지만 이 방법은 권장하지 않음 // 보는 순간 인스턴스 변수인지 혼란스러울 수 있음

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
