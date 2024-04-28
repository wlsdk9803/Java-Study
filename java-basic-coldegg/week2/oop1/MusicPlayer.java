package oop1;

public class MusicPlayer {
    //데이터(속성)의 틀
    int volume = 0;
    boolean isOn = false;

    //메소드(기능)의 틀
    void on() {
        isOn = true;
        System.out.println("음악 플레이어 실행");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void showStatus() {
        System.out.println("음악 플레이어 상태");
        if (isOn) {
            System.out.println("플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("플레이어 OFF");
        }
    }
}
