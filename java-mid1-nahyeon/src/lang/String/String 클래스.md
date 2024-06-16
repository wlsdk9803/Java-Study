# String 클래스

## 기본

자바에서 문자를 다루는 타입
- `char`
  - 문자 하나
  - 문자를 나열하려면 `char[]`을 사용함 -> 불편
- `String`
  - 문자열
  - 사실 클래스다

`String` 은 클래스다. `int` , `boolean` 같은 기본형이 아니라 참조형이다.  
따라서 `str1` 변수에는 `String` 인스턴 스의 참조값만 들어갈 수 있다.


문자열은 매우 자주 사용된다. 그래서 편의상 쌍따옴표로 문자열을 감싸면 자바 언어에서 `new String("hello")` 와 같이 변경해준다. (이 경우 실제로는 성능 최적화를 위해 문자열 풀을 사용)
```java
String str1 = "hello"; //기존
String str1 = new String("hello"); //변경
```

## String 클래스 구조

```java
public final class String {
    //문자열 보관
    private final char[] value;// 자바 9 이전 
    private final byte[] value;// 자바 9 이후
    //여러 메서드
    public String concat(String str) {...} public int length() {...}
    ...
}
```

문제 데이터 자체는 배열 필드에 저장이 된다.

개발자가 직접 다루기 불편한 `char[]` 을 내부에 감추고 `String` 클래스를 사용하는 개발자가 편리하게 문자열을 다룰 수 있는 수 있도록 다양한 기능을 제공한다. 

메서드 제공을 넘어서 자바 언어 차원에서도 여러 편의 문법을 제공한다.

> **참고: 자바 9 이후 String 클래스 변경 사항**
자바 9부터 `String` 클래스에서 `char[]` 대신에 `byte[]` 을 사용한다.
> ```java
> private final byte[] value;
> ```
> 자바에서 문자 하나를 표현하는 `char` 는 `2byte` 를 차지한다. 
> 영어, 숫자는 보통 `1byte` 로 표현이 가능하다. 
> 
> 단순 영어, 숫자로만 표현된 경우 `1byte` 를 사용하고(정확히는 Latin-1 인코딩의 경우 `1byte` 사용), 
> 그렇지 않은 나머지의 경우 `2byte` 인 UTF-16 인코딩을 사용한다. 따라서 메모리를 더 효율적으로 사용할 수 있게 변경되었다.

### 기능 (메서드)

`String` 클래스는 문자열로 처리할 수 있는 다양한 기능을 제공한다. 

- `length()` : 문자열의 길이를 반환한다.
- `charAt(int index)` : 특정 인덱스의 문자를 반환한다.
- `substring(int beginIndex, int endIndex)` : 문자열의 부분 문자열을 반환한다. 
- `indexOf(String str)` : 특정 문자열이 시작되는 인덱스를 반환한다.
- `toLowerCase()` , `toUpperCase()` : 문자열을 소문자 또는 대문자로 변환한다. 
- `trim()` : 문자열 양 끝의 공백을 제거한다.
- `concat(String str)` : 문자열을 더한다.

## String 클래스와 참조형
`String` 은 클래스이다. 따라서 기본형이 아니라 참조형이다.
참조형은 변수에 계산할 수 있는 값이 들어있는 것이 아니라 `x001`과 같이 계산할 수 없는 참조값이 들어있다.   
따라서 원칙적으로 `+` 같은 연산을 사용할 수 없다.

-> 근데 너무 자주 쓰여서 `+` 연산 해도 `concat()` 메서드 사용한 것처럼 연산해줌


## 비교


`String` 클래스 비교할 때는 `==` 비교가 아니라 항상 `equals()` 비교를 해야한다.
- **동일성(Identity)**: `==` 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인 
- **동등성(Equality)**: `equals()` 메서드를 사용하여 두 객체가 논리적으로 같은지 확인

```java
package lang.String.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교 " + (str1 == str2)); //false
        System.out.println("new String() equals 비교 " + (str1.equals(str2))); //true

        String str3 ="hello"; //x003
        String str4 = "hello"; //x004
        System.out.println("new String() == 비교 " + (str3 == str4)); //true 
        System.out.println("new String() equals 비교 " + (str1.equals(str2))); //true
    }
}
```
- `String` 클래스는 내부 문자열 값을 비교하도록 `equals()` 메서드를 재정의 해두었다. (결과가 true인 이유)

![img.png](../img/img11.png)

- `String str3 = "hello"` 와 같이 문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
- 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 `String` 인스턴스를 미리 만들어둔다. 이때 같은 문자열이 있으면 만들지 않는다.
- `String str3 = "hello"` 와 같이 문자열 리터럴을 사용하면 문자열 풀에서 `"hello"` 라는 문자를 가진 `String` 인스턴스를 찾는다. 그리고 찾은 인스턴스의 참조( `x003` )를 반환한다.
  - `String str4 = "hello"` 의 경우 `"hello"` 문자열 리터럴을 사용하므로 문자열 풀에서 `str3` 과 같은 `x003` 참조를 사용한다. 
  - 따라서 `==` 비교 결과는 **true**

> 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능도 최적화 할 수 있다.

> **참고**: 풀(Pool)은 자원이 모여있는 곳을 의미한다.   
> 프로그래밍에서 풀(Pool)은 공용 자원을 모아둔 곳을 뜻한다. 여러 곳에서 함께 사용할 수 있는 객체를 필요할 때 마다 생성하고, 제거하는 것은 비효율적이다.   
> 대신에 이렇게 문자열 풀에 필요한 `String` 인스턴스를 미리 만들어두고 여러곳에서 재사용할 수 있다면 성능과 메모리를 더 최적화 할 수 있다.
참고로 문자열 풀은 힙 영역을 사용한다. 그리고 문자열 풀에서 문자를 찾을 때는 해시 알고리즘을 사용하기 때문 에 매우 빠른 속도로 원하는 `String` 인스턴스를 찾을 수 있다.

### 문자열 비교는 항상 `equals()` 를 사용해서 동등성 비교를 해야 한다.

런타임에서 매개변수로 넘어오는 `String` 인스턴스가 `new String()` 으로 만들어진 것인지, 문자열 리터럴로 만들어 진 것인지 확인할 수 있는 방법이 없다.

## 불변 객체

`String` 은 불변 객체이다. 따라서 생성 이후에 **절대로** 내부의 문자열 값을 변경할 수 없다.
(`private final byte[] value;`)

```java
package lang.String.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat("java"); 
        //불변 객체이므로... 새로운 String 객체를 만들어서 반환

        System.out.println("str = " + str2);
        // str가 가리키는 값은 그대로
    }
}
```

## 주요 메서드

### 문자열 정보 조회

- `length()` : 문자열의 길이를 반환한다.
- `isEmpty()` : 문자열이 비어 있는지 확인한다. (길이가 0)
- `isBlank()` : 문자열이 비어 있는지 확인한다. (길이가 0이거나 공백(Whitespace)만 있는 경우), 자바 11 
- `charAt(int index)` : 지정된 인덱스에 있는 문자를 반환한다.

### 문자열 비교
- `equals(Object anObject)` : 두 문자열이 동일한지 비교한다. 
- `equalsIgnoreCase(String anotherString)` : 두 문자열을 대소문자 구분 없이 비교한다. 
- `compareTo(String anotherString)` : 두 문자열을 사전 순으로 비교한다. 
- `compareToIgnoreCase(String str)` : 두 문자열을 대소문자 구분 없이 사전적으로 비교한다. 
- `startsWith(String prefix)` : 문자열이 특정 접두사로 시작하는지 확인한다. 
- `endsWith(String suffix)` : 문자열이 특정 접미사로 끝나는지 확인한다.

### 문자열 검색
- `contains(CharSequence s)` : 문자열이 특정 문자열을 포함하고 있는지 확인한다.
- `indexOf(String ch)` / `indexOf(String ch, int fromIndex)` : 문자열이 처음 등장하는 위치를 반환한다.
- `lastIndexOf(String ch)` : 문자열이 마지막으로 등장하는 위치를 반환한다.

## 문자열 조작 및 변환
- `substring(int beginIndex)` / `substring(int beginIndex, int endIndex)` : 문자열의 부분 문자열을 반환한다.
- `concat(String str)` : 문자열의 끝에 다른 문자열을 붙인다.
- `replace(CharSequence target, CharSequence replacement)` : 특정 문자열을 새 문자열로 대체 한다.
- `replaceAll(String regex, String replacement)` : 문자열에서 정규 표현식과 일치하는 부분을 새 문자열로 대체한다.
- `replaceFirst(String regex, String replacement)` : 문자열에서 정규 표현식과 일치하는 첫 번째 부분을 새 문자열로 대체한다.
- `toLowerCase()` / `toUpperCase()` : 문자열을 소문자나 대문자로 변환한다. 
- `trim()` : 문자열 양쪽 끝의 공백을 제거한다. 단순 `Whitespace` 만 제거할 수 있다. 
- `strip()` : `Whitespace` 와 유니코드 공백을 포함해서 제거한다. 자바 11

> String은 **불변 객체이므로 변환된 새로운 String을 반환한다.**

## 문자열 분할 및 조합
- `split(String regex)` : 문자열을 정규 표현식을 기준으로 분할한다.
- `join(CharSequence delimiter, CharSequence... elements)` : 주어진 구분자로 여러 문자열을 결합한다.

## 기타 유틸리티
- `valueOf(Object obj)` : 다양한 타입을 문자열로 변환한다.
- `toCharArray():` 문자열을 문자 배열로 변환한다.
- `format(String format, Object... args)` : 형식 문자열과 인자를 사용하여 새로운 문자열을 생성한다.
- `matches(String regex)` : 문자열이 주어진 정규 표현식과 일치하는지 확인한다.

> **참고**: `CharSequence` 는 `String`, `StringBuilder` 의 상위 타입이다. 문자열을 처리하는 다양한 객체를 받을 수 있다.

## StringBuilder - 가변 String

`String` -> 불변 객체  
변경된 값을 기반으로 새로운 `String` 객체를 생성한다.

문자를 더하거나 변경할 때 마다 계속해서 새로운 객체를 생성해야 한다. -> 컴퓨터의 cpu, 메모리 자원을 더 많이 사용하게 됨  
(실제로는 문자열을 다룰 때는 자바에서 최적화를 한다.)

### StringBuilder

이런 문제를 해결하기 위해 자바는 `StringBuilder` 라는 가변 `String` 을 제공한다.

필드가 `final`로 되어있지 않음

```java
package lang.String.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println("sb = " + sb);

        sb.insert(4, "JAVA");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete  = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder (가변) => String (불변으로 바꾸기 ㄱㄴ)
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
```

1. `StringBuilder` 객체를 생성한다.
2. `append()` 메서드를 사용해 여러 문자열을 추가한다. 
3. `insert()` 메서드로 특정 위치에 문자열을 삽입한다. 
4. `delete` () 메서드로 특정 범위의 문자열을 삭제한다. 
5. `reverse()` 메서드로 문자열을 뒤집는다.
6. 마지막으로 `toString` 메소드를 사용해 `StringBuilder` 의 결과를 기반으로 `String` 을 생성해서 반환한다.

> **가변(Mutable) vs 불변(Immutable):**
> 
> - `String` 은 불변하다. 즉, 한 번 생성되면 그 내용을 변경할 수 없다. 
> - 문자열에 변화를 주려고 할 때마다 새로운 `String` 객체가 생성되고, 기존 객체는 버려진다. (참조할 대상이 없을 때 버려짐)
> - 이 과정에서 메모리와 처리 시간을 더 많이 소모한다. 
>
> - `StringBuilder` 는 가변적이다. 하나의 객체 안에서 문자열을 추가, 삭제, 수정할 수 있으며, 이때마다 새로운 객체를 생성하지 않는다. 
> - 이로 인해 메모리 사용을 줄이고 성능을 향상시킬 수 있다. 단 사이드 이펙트를 주의해야 한다.

`StringBuilder` 는 문자열을 변경하는 동안 사용하다가 문자열 변경이 끝나면 안전한(불변) `String` 으로 변환하는 것이 좋다. (사이드이펙트 방지)

## String 최적화

### 자바의 String 최적화

자바 컴파일러는 다음과 같이 문자열 리터럴을 더하는 부분을 자동으로 합쳐준다.  

1. **문자열 리터럴 최적화**  

**컴파일 전** 
```java
String helloWorld = "Hello, " + "World!"; 
```
**컴파일 후** 
```java
String helloWorld = "Hello, World!"; 
```
따라서 런타임에 별도의 문자열 결합 연산을 수행하지 않기 때문에 성능이 향상된다.

2. **String 변수 최적화**

문자열 변수의 경우 그 안에 어떤 값이 들어있는지 컴파일 시점에는 알 수 없기 때문에 단순하게 합칠 수 없다. 
```java
String result = str1 + str2; 
```
이런 경우 예를 들면 다음과 같이 최적화를 수행한다. (최적화 방식은 자바 버전에 따라 달라진다.) 
```java
String result = new StringBuilder().append(str1).append(str2).toString(); 
```

> 참고: 자바 9부터는 `StringConcatFactory` 를 사용해서 최적화를 수행한다.

이렇듯 자바가 최적화를 처리해주기 때문에 지금처럼 간단한 경우에는 `StringBuilder` 를 사용하지 않아도 된다.   
대신에 문자열 더하기 연산( `+` )을 사용하면 충분하다.

(이 경우 어설프게 builder 쓰지 말고 더하기 연산 쓰자..)

### String 최적화가 어려운 경우

```java
package lang.String.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "hello java";
        }

        long endTime = System.currentTimeMillis(); //현재 밀리초
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); //time = 2637ms 
        //개오래걸림
    }
}
```

최적화는 대충 이렇게 된다.
```java
 String result = "";
 for (int i = 0; i < 100000; i++) {
     result = new StringBuilder().append(result).append("Hello Java").toString();
}
```

최적화를 해도 반복 횟수만큼 객체를 생성해야 한다.  
반복문 내에서의 문자열 연결은 **런타임에 연결할 문자열의 개수와 내용이 결정된다.**

이 경우, 컴파일러가 예츨하기 어렵다.

이럴 때는 개발자가 **직접 `StringBuilder`를 사용해야 한다.

```java
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("hello java");
        }

        long endTime = System.currentTimeMillis(); //현재 밀리초
        String r = sb.toString();
        System.out.println("result = " + r); 
        System.out.println("time = " + (endTime - startTime) + "ms"); //time = 4ms (stringbuilder 사용시)
    }
}
```

엄청 빠르다.

### 정리

- 문자열을 합칠 때
  - 대부분 최적화가 되므로 `+` 연산하자

- **`Stringbuilder`를 사용하는 것이 더 좋은 경우**
  1. 반복문에서 반복해서 문자를 연결할 때
  2. 조건문을 통해 동적으로 문자열을 조합할 때
  3. 복잡한 문자열의 특정 부분을 변경해야 할 때
  4. 매우 긴 대용량 문자열을 다룰 때

> **참고: StringBuilder vs StringBuffer**  
`StringBuilder` 와 똑같은 기능을 수행하는 `StringBuffer` 클래스도 있다.  
`StringBuffer` 는 내부에 동기화가 되어 있어서, 멀티 스레드 상황에 안전하지만 동기화 오버헤드로 인해 성능
이 느리다.  
`StringBuilder` 는 멀티 쓰레드에 상황에 안전하지 않지만 동기화 오버헤드가 없으므로 속도가 빠르다. `StringBuffer` 와 동기화에 관한 내용은 이후에 멀티 스레드를 학습해야 이해할 수 있다.  
> 지금은 이런 것이 있구나 정도만 알아두면 된다.

