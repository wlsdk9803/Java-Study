# final

## final 변수와 상수

`class`, `method`, `변수`에 `final`키워드가 붙으면 한번 값을 할당하고 나서부터는 값을 변경할 수 없다.  

- `final`을 지역 변수에 설정할 경우 최초 한번만 할당할 수 있다.
  - 변경 시도 시 컴파일 에러
  - 선언과 동시에 초기화 해도 마찬가지로 오류
- 매개변수도 동일하게 적용된다. 함수 호출 시 인자를 주면 `final`키워드로 선언된 매개변수에 값이 할당되기 때문이다.
  - 이 경우 메서드 호출 시점에 사용된 값이 끝까지 사용된다.

### 사용 케이스

- 생성자로 `final` 필드 초기화
- 필드에서 `final` 필드 초기화
  - 이 경우 인스턴스마다 모두 동일한 값을 가질 것이므로 메모리의 낭비
  - 클래스에서 고정된 값이므로 `static final int`를 사용하는 것이 더 효율적

```java
package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;
}
```

`FieldInit.CONST_VALUE` 는 `static` 영역에 존재한다. 그리고 `final` 키워드를 사용해서 초기화 값이 변하지
않는다.  
`static` 영역은 단 하나만 존재하는 영역이다. `CONST_VALUE` 변수는 JVM 상에서 하나만 존재하므로 앞서 설명
한 중복과 메모리 비효율 문제를 모두 해결할 수 있다.



## 상수

### 상수(Constant)란?
상수는 변하지 않고, 항상 일정한 값을 갖는 수를 말한다.

자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값을 상수라 한다.
이런 이유로 상수는 `static final` 키워드를 사용한다.

### 자바 상수 특징

- 대문자를 사용하고 구분은 `_` (언더스코어)로 한다. (관례) 
  - 일반적인 변수와 상수를 구분하기 위해 이렇게 한다.
- 필드를 직접 접근해서 사용한다. -> **즉, 접근 제어자 `public` 해도 괜찮다**
  - 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적이다. 
  - 상수는 값을 변경할 수 없다. 따라서 필드에 직접 접근해도 데이터가 변하는 문제가 발생하지 않는다.

## final 변수와 참조

- 변수는 크게 기본형 변수와 참조형 변수가 있다.
  - 기본형 -> 값 보관
  - 참조형 -> 객체의 참조값 보관
  - 두 변수 다 `final`사용 시 값의 변경 불가능

```java
package final1;

public class Data {
    public int value;
}
```

```java
package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data();
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
```

참조형 변수 `data` 에 `final` 이 붙었다. 이 경우 참조형 변수에 들어있는 참조값을 다른 값으로 변경하지 못한다.  
쉽게 이야기해서 이제 **다른 객체를 참조할 수 없다.**  
그러나 `Data.value` 는 `final` 이 아니다. 따라서 값을 변경할 수 있다.

![해당 예제에 대한 해설 그림](img.png)