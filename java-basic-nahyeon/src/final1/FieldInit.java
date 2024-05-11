package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; //자바에서의 static final 변수 이름 짓기 관례 (대문자로 짓기)
    final int value = 10;

    //이렇게 초기값을 넣어버린 경우에는 생성자로 초기화 불가능
//    public FieldInit(int value) {
//        this.value = value;
//    }
}
