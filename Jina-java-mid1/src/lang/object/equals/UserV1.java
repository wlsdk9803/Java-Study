package lang.object.equals;

public class UserV1 {
    private String id;

    public UserV1(String id){
        this.id = id;
    }
}


// 동일성(Identity) VS 동등성(Equality)
// 동일성: == 연산자 사용. 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
// 동등성: equals() 메서드 사용. 두 객체가 논리적으로 동등한지 확인