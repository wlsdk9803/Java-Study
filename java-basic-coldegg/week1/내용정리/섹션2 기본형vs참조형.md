# 섹션2: 기본형vs참조형

## 1. 데이터 타입의 종류: 기본형과 참조형

- 데이터 타입의 가장 큰 두 종류
- **기본형:** int, long, double, boolean처럼 변수에사용할 값을 직접 넣는 데이터 타입
- **참조형**: Student student1, Student[] students 객체와 배열같이 참조값을 저장하는 데이터 타입
- 기본형은 데이터 실체를 담고 있으므로, 연산 등이 가능하나 참조형은 주소만으로 할 수 있는게 없다.
- 기본형을 제외한 나머지는 모두 참조형
- 기본형은 개발자가 직접 정의할 수 없음. 자바가 기본으로 제공하는 데이터 타입
- 개발자는 참조형인 클래스만 직접 정의할 수 있음
- 클래스는 모두 대문자로 시작한다.

<aside>
💡 **String은 참조형이다?**

- String은 대문자로 시작하는 것에서 알 수 있듯이, 사실 클래스다. 그런데 기본형처럼 값을 직접 대입하여 사용할 수 있다. 자바에서 특별하게 편의 기능을 제공하는 것.
</aside>

## 2. 변수 대입

- 기본형은 값을 직접 복사하는 것에 비해, 참조형은 주소값을 복사하는 것이기 때문에, 값을 직접 데려오는 것이 아니라 주소를 적은 카드를 하나 더 데려오는 것일 뿐임

```java
package ref;
	public class VarChange2 {
		public static void main(String[] args) {
		
			Data dataA = new Data();
			dataA.value = 10; //value 속성값 10
			Data dataB = dataA; //dataB에 dataA 참조값을 복사
			
			System.out.println("dataA 참조값=" + dataA);
			System.out.println("dataB 참조값=" + dataB); //둘의 참조값은 같다.
			System.out.println("dataA.value = " + dataA.value); 
			System.out.println("dataB.value = " + dataB.value); //동일참조값.value이므로 같다.
			
			//dataA 변경
			dataA.value = 20;
			System.out.println("변경 dataA.value = 20");
			System.out.println("dataA.value = " + dataA.value);
			System.out.println("dataB.value = " + dataB.value); //동일참조값.value이므로 20으로 같다.
			
			//dataB 변경
			dataB.value = 30;
			System.out.println("변경 dataB.value = 30");
			System.out.println("dataA.value = " + dataA.value); 
			System.out.println("dataB.value = " + dataB.value); //동일참조값.value이므로 30으로 같다.
			
		}
}
```

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB2%20%E1%84%80%E1%85%B5%E1%84%87%E1%85%A9%E1%86%AB%E1%84%92%E1%85%A7%E1%86%BCvs%E1%84%8E%E1%85%A1%E1%86%B7%E1%84%8C%E1%85%A9%E1%84%92%E1%85%A7%E1%86%BC%209602f5fcb8814ddea78b65596293602f/Untitled.png)

```java
package ref;
	public class MethodChange1 {
		public static void main(String[] args) {
		
			int a = 10;
			System.out.println("메서드 호출 전: a = " + a); //10
			changePrimitive(a);
			System.out.println("메서드 호출 후: a = " + a); //20(아님x) => 10
		
		}
		
		static void changePrimitive(int x) {
			x = 20;
		
	}
}
```

***왜 20이 아닌 10일까?**

- 메서드를 호출할 때 a가 직접 수정되는 게 아니라,  x라는 새로운 변수를 만들어서 a값을 복사하는 것이기 때문
- Q. int x에서 x는 가상의 매개변수이고 결국 a = 20이라는 코드 한 줄이 main에서 추가되는 게 아니었는지..?  ⇒ A. 메소드 내부에서 x를 생성하고 그 안에서만 x를 활용하도록 하는-지역변수- 같음

```java
package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        ChangeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);

    }

    static void ChangeReference(Data dataX) {
        dataX.value = 20;
    }

}
```

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB2%20%E1%84%80%E1%85%B5%E1%84%87%E1%85%A9%E1%86%AB%E1%84%92%E1%85%A7%E1%86%BCvs%E1%84%8E%E1%85%A1%E1%86%B7%E1%84%8C%E1%85%A9%E1%84%92%E1%85%A7%E1%86%BC%209602f5fcb8814ddea78b65596293602f/Untitled%201.png)

***참조형 변수가 메서드 안에서 수정되는 과정**

- 기본형 변수는 메서드 안에서 지역변수로 값이 생성되고 수정되지만, 참조형 변수는 지역변수로 참조값이 입력될지라도 그 값을 통해 실제 메모리에 접근하게 되므로 메모리 값을 변경하게 되는 것

## 3. 변수의 종류와 초기화

***변수의 종류**

- 멤버 변수(=필드): 클래스에서 선언
- 지역 변수: 메소드에서 선언, 매개변수 ⇒ 지역변수임 (메소드 내부에서만 생성되고 끝나면 제거)

+) 메인 함수 내부에서 생성되는 변수 = 지역변수!!

***변수의 값 초기화**

- 멤버 변수는 인스턴스를 생성(new)할 때 자동으로 초기화
- int = 0, boolean = false, 참조형 = null 로 각각 초기화됨
- 개발자가 초기값을 직접 지정할 수 있다.

***지역변수는 수동으로, 직접 초기화해야 한다?**

- Q. 이게 무슨 의미일까…..!!!

## 4. null

```java
public class NullMain {
    public static void main(String[] args) {
    
        Data data = null; //1. 내가 정의한 Data라는 (클래스)데이터 타입에 data 인스턴스를 생성할 건데, 초기값 주소를 따로 null로 지정하겠다.
        System.out.println("1. data = " + data);
        
        data = new Data(); //2. 이미 생성된 data 인스턴스를 다시 초기화하여 자동 주소값 생성
        System.out.println("2. data = " + data);
        
        data = null; //3. 다시 주소값을 null로 지워버림
        System.out.println("3. data = " + data);
        
    }
}
```

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB2%20%E1%84%80%E1%85%B5%E1%84%87%E1%85%A9%E1%86%AB%E1%84%92%E1%85%A7%E1%86%BCvs%E1%84%8E%E1%85%A1%E1%86%B7%E1%84%8C%E1%85%A9%E1%84%92%E1%85%A7%E1%86%BC%209602f5fcb8814ddea78b65596293602f/Untitled%202.png)

<aside>
💡 **아무도 참조하지 않는 인스턴스는?**

- C언어에서는 개발자가 직접 메모리 해제를 해줘야 누수를 막을 수 있었음
- 그러나 java에서는 JVM의 가비지컬렉션(gc)가 아무도 해당 인스턴스를 참조하지 않을 때, 더이상 활용하지 않는 인스턴스로 판단하고 자동으로 메모리를 해제 시켜줌
- JAVA는 똑똑해!
</aside>

## 5. null pointer exception 오류

- null인 주소지를 참조할 때 발생하는 예외상황(exception)

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB2%20%E1%84%80%E1%85%B5%E1%84%87%E1%85%A9%E1%86%AB%E1%84%92%E1%85%A7%E1%86%BCvs%E1%84%8E%E1%85%A1%E1%86%B7%E1%84%8C%E1%85%A9%E1%84%92%E1%85%A7%E1%86%BC%209602f5fcb8814ddea78b65596293602f/Untitled%203.png)