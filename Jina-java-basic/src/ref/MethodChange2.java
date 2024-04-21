package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        // 결과 예상
        // 메서드 호출 전: dataA.value = 10
        // 메서드 호출 후: dataA.value = 20 // 이건 참조 값을 복사해서 전달하는 거니까 그 참조 값이 가리키는 인스턴스의 멤버변수(value) 값이 바뀐다고 생각..!

        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }
    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}