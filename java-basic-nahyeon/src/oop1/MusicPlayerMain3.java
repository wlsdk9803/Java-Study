package oop1;

public class MusicPlayerMain3 {
    // 데이터를 MusicPlayerData 클래스에 별도 분리해서 사용하는 절차 지향 예시
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        // 이후에 프로그램 로직이 복잡해져서 변수가 추가되더라도 MusicPlayerData 클래스에 모여 있으므로 예시 1보다 관리가 더 쉬워진다.

        on(data);

        volumneUp(data);
        volumneUp((data));
        volumneDown(data);

        showStatus(data);
        off(data);

    }
    // 모듈화
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumneUp(MusicPlayerData data) {
        data.volumne++;
        System.out.println("음악 플레이어 볼륨: " + data.volumne);
    }

    static void volumneDown(MusicPlayerData data) {
        data.volumne--;
        System.out.println("음악 플레이어 볼륨: " + data.volumne);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");

        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 불륨: " + data.volumne);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
