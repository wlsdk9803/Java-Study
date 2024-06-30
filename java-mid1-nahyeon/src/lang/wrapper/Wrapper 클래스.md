# Wrapper 클래스

## 기본형의 한계

자바는 객체 지향 언어이다. 그런데 자바 안에 객체가 아닌 것이 있다.   
바로 `int` , `double` 같은 기본형(Primitive Type)이다.

1. **객체가 아님**: 

기본형 데이터는 객체가 아니기 때문에, 객체 지향 프로그래밍의 장점을 살릴 수 없다. 
객체가 아니므로 메서드를 제공할 수 없다.  

추가로 객체 참조가 필요한 컬렉션 프레임워크를 사용할 수 없다. 그리고 제네릭도 사용할 수 없다.

2. **null 값을 가질 수 없음**: 

기본형 데이터 타입은 `null` 값을 가질 수 없다.   
때로는 데이터가 `없음` 이라는 상태를 나 타내야 할 필요가 있는데, 기본형은 항상 값을 가지기 때문에 이런 표현을 할 수 없다.

`int`를 클래스로 만들어 보자.

`int` 자체는 클래스가 아니지만, `int`값을 가지고 클래스를 만들 수 있다.  
특정 기본형을 감싸서(Wrap) 만드는 클래스를 래퍼 클래스(Wrapper class)라고 한다.

### 1. **객체가 아님**

```java
package lang.wrapper;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) { //캡슐화 (클래스 내부로 옮김)
        if (value < target) {
            return -1;
        }
        else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value); //숫자를 문자로 반환
    }
}
```

### 2. **null 값을 가질 수 없음**
기본형은 항상 값을 가져야 한다.  
그런데 데이터가 '없음'이라는 상태가 필요할 수 있다.

```java
package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //null
    }

    public static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if(myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
```

- 앞서 만든 `MyInteger` 래퍼 클래스를 사용했다.
- 실행 결과를 보면 `-1` 을 입력했을 때는 `-1` 을 반환한다.
- `100` 을 입력했을 때는 값이 없다는 `null` 을 반환한다.
  - 기본형은 값을 항상 반환해야 하므로 이 경우 `-1`같은 어떤 값을 반환했다.

기본형은 항상 값이 존재해야 한다. 숫자의 경우 `0` , `-1` 같은 값이라도 항상 존재해야 한다.   
반면에 객체인 참조형은 값이 없다는 `null` 을 사용할 수 있다. 물론 `null` 값을 반환하는 경우 잘못하면 `NullPointerException` 이 발생할 수 있기 때문에 주의해서 사용해야 한다.


## 래퍼 클래스 - 자바 래퍼 클래스

래퍼 클래스는 기본형의 객체 버전이라고 생각하자.

자바는 기본형에 대응하는 래퍼 클래스를 기본으로 제공한다.
- `byte`
  - `Byte`
- `short`
  - `Short`
- `int`
  - `Integer`
- `long`
  - `Long`
- `float`
  - `Float`
- `double`
  - `Double`
- `char`
  - `Character`
- `boolean` 
  - `Boolean`


자바가 제공하는 기본 래퍼 클래스의 특징
- 불변이다.
- `equals` 로 비교해야 한다.

**래퍼 클래스 생성 - 박싱(Boxing)**

> 기본형을 래퍼 클래스로 변경하는 것을 마치 박스에 물건을 넣은 것 같다고 해서 **박싱(Boxing)** 이라 한다.

- `new Integer(10)`은 작동은 하지만, 향후 자바에서 제거될 예정이다.   

- 대신에 `Integer.valueOf(10)` 를 사용하면 된다.  
내부에서 `new Integer(10)` 을 사용해서 객체를 생성하고 돌려준다. 


- 추가로 `Integer.valueOf()` 에는 성능 최적화 기능이 있다.
  - 개발자들이 일반적으로 자주 사용하는 -128 ~ 127 범위의 `Integer` 클래스를 미리 생성해준다.
  - 해당 범위의 값을 조회하면 미리 생성된 `Integer` 객체를 반환한다. 해당 범위의 값이 없으면 `new Integer()` 를 호출한다.
  - 마치 문자열 풀과 비슷하게 자주 사용하는 숫자를 미리 생성해두고 재사용한다. 참고로 이런 최적화 방식은 미래에 더 나은 방식으로 변경될 수 있다.

**intValue() - 언박싱(Unboxing)**
- 래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 메서드이다.
- 박스에 들어있는 물건을 꺼내는 것 같다고 해서 **언박싱(Unboxing)** 이라 한다.


**비교는 equals() 사용**
- 래퍼 클래스는 객체이기 때문에 `==` 비교를 하면 인스턴스의 참조값을 비교한다. 
  - 따라서 int 값이 같아도 `false`를 반환할 수 있다.
- 래퍼 클래스는 내부의 값을 비교하도록 `equals()` 를 재정의 해두었다. 따라서 값을 비교하려면 `equals()` 를 사용해야 한다.

## 래퍼 클래스 - 오토 박싱

```java
package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
```

기본형 <-> 래퍼 클래스  
변환이 엄청 귀찮다.

```java
package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //오토 박싱(Auto - boxing)

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; //오토 언박생(Auto - unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
```
컴파일러가 개발자 대신 `valueOf` , `xxxValue()` 등의 코드를 추가해주는 기능이다.  
덕분에 기본형과 래퍼형을 서로 편리하게 변환할 수 있다.
따라서 `AutoboxingMain1`과 `AutoboxingMain2` 는 동일하게 작동한다.

## 주요 메서드와 성능

- `valueOf()` : 래퍼 타입을 반환한다. 숫자, 문자열을 모두 지원한다.
- `parseInt()` : 문자열을 기본형으로 변환한다.
- `compareTo()` : 내 값과 인수로 넘어온 값을 비교한다. 내 값이 크면 `1`, 같으면 `0` ,내 값이 작으면 `-1`을 반환한다.
- `Integer.sum()`, `Integer.min()`, `Integer.max()` : `static` 메서드이다. 간단한 덧셈, 작은 값, 큰 값 연산을 수행한다.

**parseInt() vs valueOf()**  
원하는 타입에 맞는 메서드를 사용하면 된다.  
- `valueOf("10")` 는 래퍼 타입을 반환한다.  
- `parseInt("10")` 는 기본형을 반환한다.  
  - `Long.parseLong()` 처럼 각 타입에 `parseXxx()` 가 존재한다.

### 래퍼 클래스와 성능

```java
package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; //반복 횟수 설정, 10억

        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime) + "ms");

        //래퍼 클래스 Long 사용
        Long sumPrimitive2 = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive2 += i; //오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive2);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime) + "ms");
    }
}
```

```text
sumPrimitive = 499999999500000000
기본 자료형 long 실행 시간 : 969ms
sumPrimitive = 499999999500000000
기본 자료형 long 실행 시간 : 2479ms
```

- 기본형 연산이 래퍼 클래스보다 대략 5배 정도 빠른 것을 확인할 수 있다.
- 기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지한다. 
  - 예를 들어 `int` 는 보통 4바이트의 메모리를 사용한다. 
- 래퍼 클래스의 인스턴스는 내부에 필드로 가지고 있는 기본형의 값 뿐만 아니라 자바에서 객체 자체를 다루는데 필요한 객체 메타데이터를 포함하므로 더 많은 메모리를 사용한다. 
  - 자바 버전과 시스템마다 다르지만 대략 8~16 바이트의 메모리를 추가로 사용한다.

> **기본형, 래퍼 클래스 어떤 것을 사용?**  
> - 일반적인 애플리케이션을 만드는 관점에서 보면 이런 부분을 최적화해도 큰 차이가 없다.
> - CPU 연산을 아주 많이 수행하는 특수한 경우이거나, 수만 ~ 수십만 이상 연속해서 연산을 수행해야 하는 경우라면 기본형을 사용해서 최적화를 고려하자. 
> - 그렇지 않은 일반적인 경우라면 코드를 유지보수하기 더 나은 것을 선택하면 된다.

**유지보수 vs 최적화**  
- 유지보수 vs 최적화 
  - 유지보수하기 좋은 코드를 먼저 고민해야 한다. 

- 성능 최적화는 대부분 단순함 보다는 복잡함을 요구하고, 더 많은 코드들을 추가로 만들어야 한다. 
  - 최적화를 위해 유지보수 해야 하는 코드가 더 늘어나는 것이다. 

- 그런데 진짜 문제는 최적화를 한다고 했지만 전체 애플리케이션의 성능 관점에서 보면 불필요한 최적화를 할 가능성이 있다. 
  - 특히 웹 애플리케이션의 경우 메모리 안에서 발생하는 연산 하나보다 네트워크 호출 한 번이 많게는 수십만배 더 오래 걸린다. 
  - 자바 메모리 내부에서 발생하는 연산을 수천번에서 한 번으로 줄이는 것 보다, 네트워크 호출 한 번 을 더 줄이는 것이 더 효과적인 경우가 많다.

- 권장하는 방법은 개발 이후에 성능 테스트를 해보고 정말 문제가 되는 부분을 찾아서 최적화 하는 것이다.
