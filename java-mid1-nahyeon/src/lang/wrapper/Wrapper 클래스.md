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


