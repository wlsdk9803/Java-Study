package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volumne = 0;
        boolean isOn = false;


        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volumne++;
        System.out.println("음악 플레이어 볼륨: " + volumne);

        // 볼륨 증가
        volumne++;
        System.out.println("음악 플레이어 볼륨: " + volumne);

        // 볼륨 감소
        volumne--;
        System.out.println("음악 플레이어 볼륨: " + volumne);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");

        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨:" + volumne);
        }
        else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

        // 제시된 순서에 맞춰서 코드를 작성한 절차지향 프로그래밍

    }
}
