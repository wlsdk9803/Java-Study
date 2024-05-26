# 섹션11: 다형성2

### 1. 다형성의 활용

```jsx
package week5.poly.ex2;

public class AnimalPolyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        //Animal타입의 dog가 담김!
        //dog는 Dog인스턴스를 가리키는 참조값
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
```

- 위 `Animal anmal` 이 중요
- 매개변수로 dog 인스턴스 참조값이 담긴 Animal 타입의 변수가 생기고,
- 해당 인스턴스의 sound() 메소드를 호출하면,
- Animal 타입의 sound()를 찾았다가 오버라이딩 체크 후 dog의 sound()로 출력됨

**+) 좀 더 개선된 코드**

```jsx
package week5.poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
```

- 결국, 추가 요구사항이 다수로 일어나도 반복되는 부분을 코드를 통해 단순화시키므로 다형성은 매우 중요한 것!

### 2. 추상 클래스

- dog, cat, cow의 sound()만 필요할 뿐, animal의 sound()는 사실상 활용되지 않음
- 이 때 추상클래스의 개념을 도입

```jsx
package week5.poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {

        //추상클래스는 활용되지 않도록 하기 위한 클래스
        //인스턴스를 생성하려고 하면 컴파일 에러
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        cat.sound();
        cat.move();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
```

- **순수 추상 클래스**
    
    ```jsx
    package week5.poly.ex4;
    
    public abstract class AbstractAnimal {
    
        public abstract void sound();
        public abstract void move();
        //클래스의 존재 의미가 추상메소드밖에 없음 => 순수 추상 클래스
    }
    ```
    
    - 모든 메소드가 추상 메소드인 클래스
    - 즉, 다형성을 위한 껍데기 클래스인 것
    - 이 때, 순수 추상 클래스를 상속받는 자식 클래스들은 **모든 메소드를 오버라이딩 해야 함.**
    - 예를 들어, 노트북 usb연결 부분이 C타입이라면 해당 노트북에 연결할 마우스 usb 역시 C타입으로 맞춰야 함

### 3. 인터페이스 - “순수 추상 클래스에 편의 기능이 추가됨”

```jsx
package week5.poly.ex5;

public interface InterfaceAnimal {

//    public abstract void sound(); 이미 인터페이스로 생성하면 abstract 선언이 필요가 없음
    void sound(); //public abstract 생략되어 있는 것
    void move();  //왜 public이냐? 클래스가 가지는 private한 요소가 없고 구현을 위해 만들어지기 때문
}
```

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB11%20%E1%84%83%E1%85%A1%E1%84%92%E1%85%A7%E1%86%BC%E1%84%89%E1%85%A5%E1%86%BC2%2056131c5db652407aa7e28d089f1eb74b/Untitled.png)

<aside>
💡 순수 추상 클래스보다는 주로 인터페이스를 사용한다.

</aside>

- 인터페이스는 순수 추상 클래스처럼 상속이 목적이 아니므로, 상속이 아니라 “구현” 이라고 표현
- 즉 부모의 메소드를 전부 구현해야 된다는 의미
- 순수 추상 클래스와 다른 점은, 추상이 아닌 메소드가 포함될 수 없다는 것
- 즉, 모든 메소드를 오버라이딩해야 한다는 제약을 걸 수 없음
- 인터페이스를 사용하는 이유
    - **제약 :** 모든 인터페이스의 메소드를 오버라이딩 해야 한다는 하나의 엄격한 “규약”을 설정할 수 있음.
    - **다중구현 :** 상속은 부모가 하나여야 함. 하지만 인터페이스는 부모를 여러 개 둘 수 있음.

### 4. 인터페이스 다중 구현

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB11%20%E1%84%83%E1%85%A1%E1%84%92%E1%85%A7%E1%86%BC%E1%84%89%E1%85%A5%E1%86%BC2%2056131c5db652407aa7e28d089f1eb74b/Untitled%201.png)

- 인터페이스 부모는 껍데기만 가질 뿐이므로, 여러 개가 있어도 다이아몬드 문제ㅡ동일한 메소드가 존재할 때, 어떤 부모의 메소드를 상속받아야 하는가?ㅡ가 발생하지 않음
- 물론 이 때 methodCommon이 중복될 필요가 없으므로 하나만 존재하면 된다.