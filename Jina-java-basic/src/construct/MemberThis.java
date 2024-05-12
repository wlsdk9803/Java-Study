package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; // 이 경우에는 멤버변수와 매개변수의 이름이 달라서 this 생략 가능
    }
    // 과거에는 'this'를 생략하지 않고 멤버변수라는 것을 명확히 하기도 했지만, ide의 발전으로 알아서 구분되기 때문에 안쓰는 것 추천 (쓰면 코드가 지저분해짐...)
}
