package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData button = new MusicPlayerData(); //클래스에 정의해놓은 속성 묶음이 필요 => button이라는 인스턴스로 데려옴

        //음악플레이어 켜기
        on(button);
//        button.isOn = true;
//        System.out.println("음악 플레이어 실행");

        //볼륨 증가
        button.volume++;
        System.out.println("음악 플레이어 볼륨: " + button.volume);
        button.volume++;
        System.out.println("음악 플레이어 볼륨: " + button.volume);

        //볼륨 감소
        button.volume--;
        System.out.println("음악 플레이어 볼륨: " + button.volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태: ");
        if (button.isOn = true) {
            System.out.println("플레이어 On, 볼륨: " + button.volume);
        } else {
            System.out.println("플레이어 OFF");
        }

        //음악 플레이어 끄기
        off(button);
//        button.isOn = false;
//        System.out.println("음악 플레이어 종료");
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 실행");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }

}