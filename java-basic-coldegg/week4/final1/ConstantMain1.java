package week4.final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수" + 1000);
        int currentUserCount = 999;

        process(currentUserCount++); //static변수를 1씩 증가해서 매개변수로 대입
        process(currentUserCount++); //static변수를 1씩 증가해서 매개변수로 대입
        process(currentUserCount++); //static변수를 1씩 증가해서 매개변수로 대입
        process(currentUserCount++); //static변수를 1씩 증가해서 매개변수로 대입
    }

    private static void process(int currentUserCount){
        if (currentUserCount > 1000){
            System.out.println(" 대기자입니다. ");
        }
        else {
            System.out.println(" 참여자입니다.");
        }
    }
}

