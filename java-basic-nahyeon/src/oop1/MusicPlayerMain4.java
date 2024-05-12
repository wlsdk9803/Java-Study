package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        //음악 플레이어 켜기
        player.on();

        //볼륨 증가
        player.volumeUp();
        player.volumeUp();

        //볼륨 감소
        player.volumeDown();

        //음악 플레이어 상태
        player.showStatus();

        //음악 플레이어 끄기
        player.off();

        //MusicPlayer를 사용하는 입장에서는 MusicPlayer의 내부에 어떤 속성(데이터)가 있는지 몰라도 된다.
        //단순히 필요한 기능을 호출해서 사용하기만 하면 된다.
    }
}
