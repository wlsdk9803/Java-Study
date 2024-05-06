package week3.src.access;

public class SpeakerPrivateMain {

    public static void main(String[] args) {
        SpeakerPrivate speaker = new SpeakerPrivate(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        //값이 프라이빗한 상태 => 인스턴스의 속성 필드로 직접 접근 불가능
        System.out.println("volume 필드에 직접 접근합니다.");
//        speaker.volume = 200; //error
        speaker.showVolume();
    }
}