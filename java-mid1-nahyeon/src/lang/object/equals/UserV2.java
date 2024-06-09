package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj; //obj를 UserV2로 캐스팅 -> 필드 id를 찾기 위해서
//        return id.equals(user.id); //String 비교 시에는 equals 메서드를 사용해야 한다 -> 자바에서 같은 문자열인 경우 최적화를 해준다고 했는데 그것 때문인듯?
//    }

    //정확한 equals 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
}
