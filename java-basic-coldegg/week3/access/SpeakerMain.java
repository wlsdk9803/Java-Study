package week3.src.access;

import week3.src.access.Speaker;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        //값이 퍼블릭한 상태 => 인스턴스의 속성 필드로 직접 접근해서 수정이 가능
        System.out.println("volume 필드에 직접 접근합니다.");
        speaker.volume = 200;
        speaker.showVolume();
    }
}