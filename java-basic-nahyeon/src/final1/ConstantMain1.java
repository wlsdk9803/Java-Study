package final1;

//import static final1.Constant.MAX_USERS;

public class ConstantMain1 {
    public static void main(String[] args) {
//        System.out.println("프로그램 최대 참여자 수 " + 1000);
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
//        if (currentUserCount > 1000) { //1000의 의미가 무엇인지 유추하기 힘든 경우 -> magic number
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
