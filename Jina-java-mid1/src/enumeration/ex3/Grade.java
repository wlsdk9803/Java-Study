package enumeration.ex3;

public enum Grade {
    BASIC, GOLD, DIAMOND
}

// 아래 코드와 거의 같다.
// public class Grade extends Enum {
//     public static final Grade BASIC = new Grade();
//     public static final Grade GOLD = new Grade();
//     public static final Grade DIAMOND = new Grade();
//
//     private Grade() {}
// }