# System 클래스

`System` 클래스는 시스템과 관련된 기본 기능들을 제공한다.

```java
package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        //System은 운영체제 시스템과 관련된(+자바에 관련된) 몇 가지 간단한 기능을 제공해 주는 클래스다
        //현재 시간을(밀리초) 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경 변수를 읽는다.
//        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다.
        //자바가 사용하는 시스템의 환경, 시스템의 속성을 읽을 수 있다. (인코딩, 자바 버전 등등..)
        System.out.println("properties = " + System.getProperties());

        System.out.println("Java Version = " + System.getProperty("java.version")); //22

        //배열을 고속으로 복사한다.
        char[] originialArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];

        System.arraycopy(originialArray, 0, copiedArray, 0, originialArray.length);
        //운영체제가 레벨에서 통째로 읽어서 복사 -> 속도가 굉장히 빠르다

        // 배열 출력
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);
    }
}
```


- **표준 입력, 출력, 오류 스트림**: `System.in` , `System.out` , `System.err` 은 각각 표준 입력, 표준 출력, 표준 오류 스트림을 나타낸다.
- **시간 측정**: `System.currentTimeMillis()` 와 `System.nanoTime()` 은 현재 시간을 밀리초 또는 나노초 단위로 제공한다.
- **환경 변수**: `System.getenv()` 메서드를 사용하여 OS에서 설정한 환경 변수의 값을 얻을 수 있다. 
- **시스템 속성**: `System.getProperties()` 를 사용해 현재 시스템 속성을 얻거나 `System.getProperty(String key)` 로 특정 속성을 얻을 수 있다. 
  - 시스템 속성은 자바에서 사용하는 설정 값이다.
- **시스템 종료**: `System.exit(int status)` 메서드는 프로그램을 종료하고, OS에 프로그램 종료의 상태코드를 전달한다. 
  - 상태코드 `0` : 정상종료 
  - 상태 코드 `0` 이 아님: 오류나 예외적인 종료
  - 프로그램을 바로 끝내버리기 때문에 가급적 쓰지 말자
  - 웹 어플리케이션에서는 절대 쓰지 말자. 사용자의 요청을 처리하는 와중에 갑자기 프로그램이 종료될 수 있다.
  - 모든 로직을 끝내고 명확하게 끝내야 할 때는 가능
- **배열 고속 복사**: `System.arraycopy` 는 시스템 레벨에서 최적화된 메모리 복사 연산을 사용한다. 직접 반복문을 사용해서 배열을 복사할 때 보다 수 배 이상 빠른 성능을 제공한다.