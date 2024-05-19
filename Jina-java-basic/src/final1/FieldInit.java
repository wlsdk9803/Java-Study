package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; // static final은 변수명을 대문자로 쓰는 것이 관례 (일반적인 변수랑 구분하기 위해)
    // 상수는 값을 변경할 수 없기 때문에 필드에 직접 접근해도 문제가 발생하지 않음.

    final int value = 10; // 이미 값이 할당되어 생성자를 통해 할당 불가능 // 메모리 낭비 문제로 static final 쓰고 이건 잘 안씀

//    public FieldInit(int value){
//        this.value = value; // 재할당 불가능
//    }
}