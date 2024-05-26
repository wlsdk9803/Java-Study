# 섹션8: final

*** final 변수란?**

- const 처럼, 값을 변경할 수 없는 변수로 선언하는 것
- 클래스, 메소드를 포함한 여러 곳에 가능
- final 키워드가 사용되는 종류에 따라 살펴보자.

### **1️⃣ 지역변수 final**

```java
package week4.final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int local;
        local = 10;
        //local = 20; //error: final 선언은 변수를 수정할 수 없다는 의미

        method(10); //error        
    }

	//복습: 메인 메소드는 static 메소드이므로 static 메소드만 호출 가능
    static void method(final int param){
        //param = 20; //error: final로 선언된 매개변수는 값을 수정할 수 없음
    }

}
```

- **지역변수 final:** final 키워드가 메소드 내부에서 선언될 때
- 한번 초기화된 값을 변경할 수 없음
- **매개변수 final:** final 키워드가 메소드의 인자로 사용될 때
- 한번 호출된 값을 변경할 수 없음

### 2️⃣ 멤버**변수 final**

<aside>
💡 **용어정립:** 멤버=필드
⇒ 클래스가 가지는 구성원 = 클래스(static) 변수 + 인스턴스 변수를 포함

*****전역변수/지역변수:** java는 클래스바깥에 변수를 선언할 수 없으니 애초에 전역 변수를 지원하지 않지만, java에서도 생명주기를 프로그램 생성부터 종료까지 가지며 소스 코드 어디에서나 사용 가능한 **static변수를 일반적으로 전역 변수**라고 부름. 그러나 public이 아니라면? 전역 변수라고 할 수 없겠지!? 따라서 java에서 전역/지역 변수는 상대적인 개념이다*

</aside>

```java
package week4.final1;

public class ConstructInit {
    
    //fianl 인스턴스변수 (생성자 초기화)
    final int instvalue;

    public ConstructInit(int initvalue) {
        this.instvalue = initvalue;
    }

}
```

```java
package week4.final1;

public class ConstructInit {
		
		//final 인스턴스 변수
    final int instvalue = 10; //필드 초기화(*생성자가 아닌, 직접 필드에서 초기화)

    //final 전역(static) 변수 = 상수
    static final int CONST_VALUE = 100;

}
```

```java
package week4.final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        //생성자에서 초기화된 final 변수 출력
        ConstructInit inst1 = new ConstructInit(10); //인스턴스 변수 생성 및 매개변수 생성자 호출
        System.out.println(inst1.instvalue);

        //필드에서 초기화된 final 변수 출력
        FieldInit inst2 = new FieldInit(); //인스턴스 변수 생성 및 디폴트 생성자 호출
        System.out.println(inst2.instvalue);

        //필드에서 초기화된 static 변수 출력
        System.out.println(FieldInit.CONST_VALUE);
    }

}

```

- **멤버변수 final:** final 키워드가 클래스 내부에서 선언될 때
- 생성자 초기화든 필드 초기화든, 한번 초기화된 값은 변경할 수 없음
- 생성자로 초기화하는 경우, 인스턴스를 생성할 때마다 final 변수에 값을 넣어 사용하고, 해당 값은 이후 변경될 수 없음
- static final 변수는 전역적으로 변하지 않는 값이므로 상수라고 부르며, 대문자를 사용하고 ‘_’로 의미를 구분

<aside>
💡 **만약 final 변수를 인스턴스 생성시(=참조값)에 사용한다면?**
참조값이 변하지 않는 것이지, 참조값을 통해 인스턴스 변수의 값을 변경할 수 있게 된다.

</aside>

### 3️⃣ 상수의 활용

```java
package week4.final1;

public class Constant {
    //수학 상수
    public static final double PI = 3.14;
    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;
    //애플리케이션 설정 상수
    public static final int MAX_USERS = 2000;
}
```

- 프로그램 전체에서 쓰이는 상수를 정의해놓고, 여러 클래스에서 해당 값을 사용

```java
package week4.final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수" + Constant.MAX_USERS);
        int currentUserCount = 999;

        process(currentUserCount++); //static변수를 1씩 증가해서 매개변수로 대입
        process(currentUserCount++); 
        process(currentUserCount++); 
        process(currentUserCount++);
    }

    private static void process(int currentUserCount){
        if (currentUserCount >Constant.MAX_USERS){
            System.out.println(" 대기자입니다. ");
        }
        else {
            System.out.println(" 참여자입니다.");
        }
    }
}
```

- MAX_USERS를 정의해놓은 경우, 매번 숫자로 쓰는 게 아니라 상수 클래스로 고정해놓고 사용해야 높은 가독성과 접근성을 제어할 수 있다.