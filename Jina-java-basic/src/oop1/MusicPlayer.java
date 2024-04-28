package oop1;

// 캡슐화
// 아래 MusicPlayer처럼 속성과 기능을 묶어서 필요한 기능을 메서드를 통해 외부로 전달하는 것이 캡슐화임!
public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    // MusicPlayerMain4부터 추가
    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn) System.out.println("음악 플레이어 ON. 볼륨: " + volume);
        else System.out.println("음악 플레이어 OFF");
    }
}
