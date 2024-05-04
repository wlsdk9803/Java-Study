package access;

public class Speaker {
    //int volume; // 기본 접근제어자는 'default' (또는 'package-private') // 같은 패키지 안에서만 호출 허용
    private int volume; // private으로 모든 외부 호출 막음. 즉 클래스 코드 안에서만 접근 가능
    // 접근 제어자 종류
    // private(클래스 내부만 허용), default(패키지 내부만 허용), protected(패키지 내부 + 상속 관계), public(다 허용)

    Speaker(int volume){
        this.volume = volume;
    }
    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }
        else{
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }
    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
