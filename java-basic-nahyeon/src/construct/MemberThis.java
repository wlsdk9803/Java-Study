package construct;

public class MemberThis {
    String nameField;

    void initMemeber(String nameParameter) {
        nameField = nameParameter;
        // 지역 변수에 nameField가 없으므로 멤버 변수에서 찾아서 사용하게 된다 -> this 생략됨
        //다음과 같이 멤버 변수에 접근하는 경우에 항상 `this` 를 사용하는 코딩 스타일도 있다.
        //this.nameField 이렇게
        //nameField가 클래스의 멤버 변수라는 것을 대충 봐도 알수 있음
        //근데 요새는 IDE가 잘 되어 있어서 굳이?
    }
}
