package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); // final data 참조형 변수는 새로운 값을 담을 수 없다.
        //참조대상 변경 불가능!


        //참조 대상'의' 값은 변경 가능
        // 참조값 자체는 변경할 수 없지만, 참조하는 대상의 값은 변경할 수 있다.

        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
