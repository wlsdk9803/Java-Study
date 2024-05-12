package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // data는 참조형
        // data = new Data(); // final 변수이므로 컴파일 에러 (참조 대상을 변경할 수 없다는 뜻)

        // 참조 대상의 값은 변경 가능 (참조 대상만 변경 불가한 것!)
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
