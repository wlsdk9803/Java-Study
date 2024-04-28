package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData button = new MusicPlayerData();

        //1. 음악 플레이어 켜기
        on(button);
        //2. 볼륨 증가
        volumeUp(button);
        //3. 볼륨 증가
        volumeDown(button);//볼륨 감소
        //4. 음악 플레이어 상태
        showStatus(button);
        //5. 음악 플레이어 끄기
        off(button);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어 실행");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태");
        if (data.isOn) {
            System.out.println("플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("플레이어 OFF");
        }
    }

}