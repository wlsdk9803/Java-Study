# 섹션12: 다형성과 설계

### 1. 객체 지향 프로그래밍

- 프로그램을 유연하고 변경이 용이하게 만든다.
- 컴포넌트를 쉽고 유연하게
- 다형성 ⇒ “역할(인터페이스)”과 “구현”
    
    ![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB12%20%E1%84%83%E1%85%A1%E1%84%92%E1%85%A7%E1%86%BC%E1%84%89%E1%85%A5%E1%86%BC%E1%84%80%E1%85%AA%20%E1%84%89%E1%85%A5%E1%86%AF%E1%84%80%E1%85%A8%206ee3e0562af7420e865d19cc4a20ca14/Untitled.png)
    
    - K3에서 아반떼로 바뀌어도 자동차라는 인터페이스 덕분에 동일하게 운전 가능
    - 장동건이 로미오 역할을 맡을 때, 줄리엣이 김태희든 송혜교든 줄리엣이라는 역할을 상대로 역할을 구현
- 객체 클라이언트 ↔ 객체 서버
    - 클라이언트는 어떤 것이든 될 수 있음
    - 서버이면서 클라이언트도 될 수 있다.
- 클라이언트 코드의 변경없이, K3를 탈지 아반떼를 탈지 유연하게 변경 가능

```jsx
package week6.car1;

public interface Car {

    void startEngine();
    void offEngine();
    void pressAccelerator();

}
```

```jsx
package week6.car1;

public class K3Car implements Car{

    @Override
    public void startEngine() {
        System.out.println("K3Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("K3Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car.pressAccelerator");
    }
}
```

```jsx
package week6.car1;

public class Model3Car implements Car{

    @Override
    public void startEngine() {
        System.out.println("Model3Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.pressAccelerator");
    }
}
```

```jsx
package week6.car1;

public class Driver {
    private Car mycar;

    public void setCar(Car car){
        System.out.println("자동차를 설정합니다: " + car);
        this.mycar = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다. ");
        mycar.startEngine();
        mycar.pressAccelerator();
        mycar.offEngine();
    }
}
```

```jsx
package week6.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver user = new Driver();

        //차량 선택
        K3Car k3 = new K3Car(); //x001 => mycar
        user.setCar(k3);
        user.drive(); //x001.startEngine ...
                        //mycar는 Car 타입이므로 Car에서 startEngine을 먼저 찾고,
                        //override된 것이 있으므로 K3Car타입의 startEngine을 호출하게 됨

        System.out.println(k3);

        //차량 변경
        Model3Car model3 = new Model3Car();
        user.setCar(model3);
        user.drive();
    }
}
```

![Untitled](%E1%84%89%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB12%20%E1%84%83%E1%85%A1%E1%84%92%E1%85%A7%E1%86%BC%E1%84%89%E1%85%A5%E1%86%BC%E1%84%80%E1%85%AA%20%E1%84%89%E1%85%A5%E1%86%AF%E1%84%80%E1%85%A8%206ee3e0562af7420e865d19cc4a20ca14/Untitled%201.png)

- CarMain
    - Driver를 생성 - Driver는 Car 타입의 mycar를 가짐
    - K3Car 타입의 k3를 생성, setCar()로 k3를 mycar에 대입
    - k3는 Car타입의 인터페이스 구현이므로 Car와 K3Car 타입의 정보를 모두 담고 있음
    - drvie()로 운전하면 Car 타입의 mycar에서 메소드를 찾고, 오버라이딩된 K3Car의 메소드로 출력

### 2. OCP(Open-Closed) 원칙

- 클라이언트 코드의 변경없이 서버의 기능을 확장할 수 있어야 한다는 원칙

<aside>
💡 **전략패턴 :** 디자인 패턴 중 하나로, 알고리즘을 클라이언트 코드의 변경 없이 쉽게 교체할 수 있도록 만든 패턴.

</aside>

**ex)** 위의 예시로 Car 인터페이스가 전략을 정의하는 인터페이스, 각각의 차량 기종은 전략의 구체적인 구현. 그리고 전략을 클라이언트 코드(Driver)의 변경 없이 손쉽게 교체 가능함