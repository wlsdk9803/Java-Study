# 섹션9: 상속

### **1️⃣ 상속 관계**

```java
package week4.extends1.ex2;

public class Car {

    //주유차(가솔린차)와 전기차는
    //차 라는 공통 속성을 가짐
    //Car 에 속하는 클래스는 모두 이동 기능을 가져야 한다.

    //공통 메소드1: 이동 기능
    public void move() {
        System.out.println("이동합니다.");
    }
}

```

```java
package week4.overriding;

public class ElectricCar extends Car {

    //전기차 메소드1: 공통 메소드를 상속받아 재정의
    @Override
    public void move(){
        System.out.println("가속 이동합니다.");
    }

    //전기차 메소드2: 충전 기능
    public void charge(){
        System.out.println("충전합니다.");
    }

}
```

- 애노테이션(@)을 사용하여 부모메소드를 오버라이딩(재정의)해서 사용한다.
- 만약, 오타가 나서 moveee가 되면, 애노테이션 덕분에 컴파일 오류가 난다.

<aside>
💡 직속 관계의 상속 부모는 하나만 존재해야 한다. (부모를 통해 조부모 등 상속은 가능)

</aside>

### 2️⃣ **상속 호출의 메모리 구조**

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB9%20%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A9%E1%86%A8%202f7fcaf191cf4cb896509fec3ad82c2d/Untitled.png)

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB9%20%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A9%E1%86%A8%202f7fcaf191cf4cb896509fec3ad82c2d/Untitled%201.png)

- 단순히 변수와 메소드만 상속받는 게 아니라 해당 클래스의 정보까지 같이 메모리에 적재되므로, 인스턴스 메모리에 부모와 자식 클래스를 위한 공간이 구분되어 생성됨
- 인스턴스가 가지는 메소드를 호출할 때, 먼저 본인 클래스에서 찾고, 없으면 부모 관계의 클래스로 올라가서 찾는다.

### 3️⃣ **상속과 메소드 오버라이딩**

*** 오버라이드된 메소드 호출의 메모리 구조**

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB9%20%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A9%E1%86%A8%202f7fcaf191cf4cb896509fec3ad82c2d/Untitled%202.png)

- 본인 클래스에서 먼저 찿는 방식으로 메소드가 호출됨
- 이미 찾은 메소드는 부모로 올라갈 필요없이 끝
- 따라서, 이름이 같아도 본인 클래스에서 재정의된 메소드가 실행된다.

* **오버라이딩과 오버로딩**

> 오버라이딩 (overriding)
> 
- 부모의 메소드를 내 클래스에서 다시 정의해서 사용하고 싶을 때
- 그러나 메소드 이름은 동일하게 사용해야 할 때
- ⇒ 부모 메소드와 이름은 같지만 기능은 재정의된 자식 메소드를 사용한다: 오버라이딩

> 오버로딩 (overloading)
> 
- 생성자 오버로딩과 같이, 동일한 메소드를 매개변수를 다르게 받아서 각각 다르게 정의하고 싶을 때
- ⇒ 매개변수를 각각 다르게 받고 싶어서, 이름이 같은 메소드를 매개변수가 다르게 여러개 사용하고 싶을 때: 오버로딩

*** 메소드 오버라이딩 조건**

- **메소드 이름**
- **반환 타입**
- **메소드 매개변수(파라미터)** : 타입, 순서, 개수 모두 동일해야 함
- **접근 제어자**: 상위 클래스의 메소드보다 더 제한적일 수 없다. (ex. 부모에서 protected인데 자식에서 private 혹은 default로 오버라이드할 수 없음.)
- **예외**
    - static: 클래스 레벨에서 사용하기 위함이므로 오버라이딩할 수 없음 (상속의 의미는 인스턴스가 공통으로 내려받는 속성이므로, 클래스 레벨인 static 메소드를 인스턴스 레벨에서 오버라이딩해서 쓸 필요가 없다)
    - final: final 메소드는 변경될 수 없으므로 재정의될 수도 없다.
    - private: private 메소드로 선언되면, 애초에 다른 클래스(자식 클래스라도)에서 호출조차 불가능함, 따라서 재정의할 수도 없다.
- **생성자:** 오버라이딩 불가능, 자식 클래스의 생성자는 부모 클래스의 생성자를 호출하는 super 키워드를 사용하여 부모 클래스의 생성자를 실행

### 4️⃣ **상속과 접근제어자 활용**

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB9%20%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A9%E1%86%A8%202f7fcaf191cf4cb896509fec3ad82c2d/Untitled%203.png)

- 하나의 인스턴스가 생성된 것처럼 보이지만, child 메소드에서 상속받은 parent 정보에 접근하려고 하면, parent 입장에서는 외부에서 자신의 정보를 요청하는 것
- 따라서 접근제어자가 가동된다.
- 그러나 인스턴스가 상속받은 parent의 메소드를 실행시키면, 그 parent의 메소드는 자기 자신의 정보에 모두 접근할 수 있다.

```java
public class Parent {

    public int val1;
    protected int val2;
    int val3;
    private int val4;
    
}
```

```java
public class Child extends Parent {
    int val1 = 2; //이 때 val1은 부모클래스의 변수를 재정의..?

    public void childvalue(){
		    val2 = 3;
        System.out.println("상속받은 퍼블릭 값: "+val1);
        System.out.println("상속받은 프로텍티드 값: "+val2);
        //System.out.println("child 디폴트 값: "+val3);
        //parent에서 정의된 디폴트값은 같은 패키지끼리만 사용하려고 만든 변수
        //외부 패키지에서 생성된 자식은 사용할 수 없다
    }
}
```

- val2는 parent 값을 사용하기 위해 인스턴스가 상속받은 parent에 접근해서 값을 변경하는 것이고
- Q. val1은 parent 값을 재정의해서 child에 저장하는 것..? 변수가 오버라이딩 된건가? ⇒ A. 아래 super 챕터에서 해결!

*** parent와 child가 가지는 동일한 이름의 변수**

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB9%20%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A9%E1%86%A8%202f7fcaf191cf4cb896509fec3ad82c2d/Untitled%204.png)

- 오버라이딩과는 관련없다.
- super()를 통해 부모가 가진 동일한 이름의 변수에 접근 가능

```java
public class Child extends Parent {

    public void childMethod(){
        publicmove();
        protectedmove(); //상속관계허용
        //defaultmove();
    }

    int val1 = 2; //이 때 val1은 부모클래스의 변수를 재정의..?
    //만약 재정의가 맞다면, 자식 클래스에서 parent 메소드를 호출했을 때, 동일한 이름의 val3, val4가 부모 클래스에서 정의된 값이 아니라 자식 클래스의 값으로 출력되어야 함
    int val3 = 2;
    int val4 = 2;

    public void childvalue(){
        val2 = 1;
        //하지만 parentvalue() 출력결과: 전부 0으로 parent의 값이 나온다
        //즉, 재정의가 아닌 그냥 이름이 같은 각각의 변수
        //아래 childvalue() 출력결과: val1,val4는 위에서 만든 인스턴스 > child 내부에 존재하는 값이고, val2는 인스턴스 > parent 내부에 존재하는 값이 호출된 것
        System.out.println("child 자신의 퍼블릭 값: "+val1); //2
        System.out.println("상속받은 프로텍티드 값: "+val2); //1
        System.out.println("child 자신의 프라이빗 값: "+val4); //2

    }    
```

- **+) 부모의 private 메소드를 자식 클래스에서 다시 정의했더니, 됐다?**
    - 자식 클래스에서 부모 클래스와 동일한 이름의 변수를 만드는 것이 가능함을 알게 돼서, 부모의 private 메소드와 동일한 이름의 메소드를 자식 클래스에서 만들면 어떻게 되는지 실험해보았다..!
    
    ```java
    public void privatemove(){
            System.out.println("Parent.prviatemove에 접근불가하므로 재정의 할 수 없어야 함");
            //Q. 하지만 된다..! 뭐지 => A. 이는 오버라이딩한 게 아니라, 그냥 메소드 이름이 동일한 다른 메소드였다.
            //위의 동일한 이름의 변수와 마찬가지로, 정상적으로 "오버라이딩" 했다면 부모 클래스에서 동일 이름의 메소드를 호출해도, 부모 메소드가 아니라 오버라이딩된 자식의 메소드가 호출되어야 한다.
            //따라서 여기서 만든 privatemove는 부모의 private 메소드와는 전혀 관련없음
        }
    ```
    
    - 결과적으로 컴파일 에러는 뜨지 않았다.
    - 하지만 이 때 동일한 이름의 메소드는, **실제 부모에 접근해서 자식이 재정의한 오버라이딩이 아니라,** 부모에게 접근하지 않고 자식이 그냥 같은 이름으로 만든 메소드
    - 부모 클래스의 메소드까지 덮어쓰는 오버라이딩과, 부모 클래스의 것에 접근을 전혀 하지 않고 그저 동일한 이름인 메소드 및 변수는 아예 다른 개념임을 알게 되고, 후자의 경우가 에러없이 정상적으로 가능함을 알게 되었다.
    
    ([https://sragent.tistory.com/entry/자바에서-private-메소드의-재정의overriding](https://sragent.tistory.com/entry/%EC%9E%90%EB%B0%94%EC%97%90%EC%84%9C-private-%EB%A9%94%EC%86%8C%EB%93%9C%EC%9D%98-%EC%9E%AC%EC%A0%95%EC%9D%98overriding))
    

### 5️⃣ **생성자 super**

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB9%20%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A9%E1%86%A8%202f7fcaf191cf4cb896509fec3ad82c2d/Untitled%205.png)