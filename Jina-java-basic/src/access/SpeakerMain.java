package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

//        // 필드에 직접 접근
//        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; // volume을 private으로 설정하니까 컴파일 오류남
//        speaker.showVolume();
//        // 볼륨은 100으로 제한하기로 했는데 문제가 생김!
//        // 왜 이런 문제가 생겼지?
//        // 사용자가 필드와 메서드에 모두 접근할 수 있어서...!
//        // 그렇다면 필드는 외부에서 접근 못하도록 막아야겠다 => 접근제어자
    }
}