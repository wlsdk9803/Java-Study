package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        // 객체지향
        // 사용하는 입장에서는 데이터는 몰라도 되고 기능만 알면 됨!

        // 이게 왜 객체지향이냐면...
        // 이전에는 데이터를 불러와서 어떻게 실행할 지 순서가 더 중요했다면
        // 이건 MusicPlayer라는 객체를 어떻게 잘 만들 지가 더 중요하기 때문...!

        MusicPlayer player = new MusicPlayer();
        // 음악 플레이어 켜기
        player.on();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 음악 플레이어 상태
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();
    }
}