# 섹션 6: 접근 제어자
- git 해결을 위한 코드 추가
- **용어 정립:** 속성 = 필드, 행위 = 메서드

## 1. “접근 제어자”가 필요한 이유

```jsx
package week3.access;

import week3.access.Speaker;

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
```

```jsx
package week3.access;

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
        speaker.volume = 200; //error
        speaker.showVolume();
    }
}
```

<aside>
💡 좋은 프로그램은 적절한 제한으로 통제하는 프로그램이다.

</aside>

## 2. 접근 제어자의 사용

*** 접근 제어자의 종류**

- private: 클래스 다르면 접근 차단
- default: 패키지 다르면 접근 차단
- protected: 패키지 다르면 상속 관계의 호출만 허용
- public: 모두 허용

<aside>
💡 **접근 제어자는 속성(필드), 메서드, 생성자에 사용**
+) 클래스에도 사용 가능
+) 지역 변수에는 사용 불가, 지역 변수는 애초에 함수 내부에서만 사용 가능하기 때문

</aside>

*** 접근 제어자의 사용 - 클래스 레벨**

- 클래스의 접근 제어자는 public, default만 사용
- 하나의 자바 파일에 public 클래스는 하나만 사용할 수 있음
    - 구분하기 위해 public 클래스는 파일명과 이름이 같아야 함 (자동지정)
    - default 클래스는 무한정 만들 수 있음

## 3. 캡슐화

어떤 것을 숨기고 어떤 것을 노출해야 할까?

1. 데이터를 숨기는 경우
- 자동차에서 엑셀을 밟으면, 자동차 내부의 컴포넌트들이 동작하면서 움직이듯이, 우리는 내부의 동작을 제어하지 못하고 외부의 기능인 엑셀만을 통해서 접근함

1. 기능을 숨기는 경우
- 자동차에서 복잡한 엔진 조절 기능, 배기 기능까지 우리가 알 필요는 없음
- 몇몇 내부 기능들은 사용자에게 제공될 필요 없음