package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; // private으로 접근 제어자 지정후 -> 컴파일 에러 발생
        //volume has private access in access.Speaker
        //`volume` 필드는 `private` 으로 설정되어 있기 때문에 외부에서 접근할 수 없다는 오류이다.
        speaker.showVolume(); // 수정이 되어버림 omg
        // Main에서 인스턴스의 필드에 직접 접근할 수 있기 때문이다.. -> 접근 제어자 필요!
    }
}
