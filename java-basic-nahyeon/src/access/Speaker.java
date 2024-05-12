package access;

public class Speaker {
//    int volume;
    private int volume; // Speaker 안에서만 필드에 접근할 수 있도록 접근 제어자 지정
    // private -> 해당 클래스 내부에서만 호출 가능.

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp(){
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }
        else {
            volume += 10;
            System.out.println("음량이 10 증가합니다.");
        }
    }
    void volumeDown(){
        volume -= 10;
        System.out.println("volumneDown 호출~");
    }

    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
