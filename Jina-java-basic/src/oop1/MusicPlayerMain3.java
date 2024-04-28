package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // 메서드 사용 // 아직도 절차지향
        // 정말 잘 만든 절차지향이지만 데이터와 기능이 분리되어 있다는 한계 존재
        // 데이터는 MusicPlayerData, 기능은 MusicPlayerMain3
        // 따라서 데이터 변경 시 MusicPlayerMain3의 메서드도 함께 변경해야 하고, 유지보수 측면에서도 번거로움

        MusicPlayerData data = new MusicPlayerData();
        // 음악 플레이어 켜기
        on(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 감소
        volumeDown(data);
        // 음악 플레이어 상태
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
    }
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) System.out.println("음악 플레이어 ON. 볼륨: " + data.volume);
        else System.out.println("음악 플레이어 OFF");
    }
}
