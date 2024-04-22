package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA); //매개변수에 참조값을 복사해서 전달 !
        //따라서 메서드 호출 후 dataA.value는 20이다.
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }
    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
