# Class 클래스

자바에서 `Class` 클래스는 클래스의 정보(메타데이터)를 다루는데 사용된다. 

- **타입 정보 얻기**: 클래스의 이름, 슈퍼클래스, 인터페이스, 접근 제한자 등과 같은 정보를 조회할 수 있다. 
- **리플렉션**: 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 등의 작업을 할 수 있다.
- **동적 로딩과 생성**: `Class.forName()` 메서드를 사용하여 클래스를 동적으로 로드하고, `newInstance()` 메서드를 통해 새로운 인스턴스를 생성할 수 있다.
- **애노테이션 처리**: 클래스에 적용된 애노테이션(annotation)을 조회하고 처리하는 기능을 제공한다.
  - `@Controller` <- 이런거

`String.class`는 `String` 클래스에 대한 `Class` 객체를 나타내며, 이를 통해 `String` 클래스에 대한 메타데이터를 조회하거나 조작할 수 있다.

```java
package lang.clazz;
 import java.lang.reflect.Field;
 import java.lang.reflect.Method;
 public class ClassMetaMain {
     public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz = String.class; // 1.클래스에서 조회
        //Class clazz = new String().getClass();// 2.인스턴스에서 조회
        //Class clazz = Class.forName("java.lang.String"); // 3.문자열로 조회
        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields(); for (Field field : fields) {
                     System.out.println("Field: " + field.getType() + " " +
         field.getName());
        }
        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods(); for (Method method : methods) {
                     System.out.println("Method: " + method);
                 }
        // 상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces(); for (Class i : interfaces) {
                     System.out.println("Interface: " + i.getName());
                 }
        } }
```

**주의!**  
`main()` 옆에 `throws Exception` 이 추가된 부분에 주의하자. 이 코드가 없으면 컴파일 오류가 발생한다. 자세한
내용은 예외 처리에서 학습한다.

`Class` 클래스는 다음과 같이 3가지 방법으로 조회할 수 있다.   

```java
Class clazz = String.class; // 1.클래스에서 조회
Class clazz = new String().getClass();// 2.인스턴스에서 조회
Class clazz = Class.forName("java.lang.String"); // 3.문자열로 조회 
```

**Class 클래스의 주요 기능**  
- **getDeclaredFields()**: 클래스의 모든 필드를 조회한다. 
- **getDeclaredMethods()**: 클래스의 모든 메서드를 조회한다. 
- **getSuperclass()**: 클래스의 부모 클래스를 조회한다. 
- **getInterfaces()**: 클래스의 인터페이스들을 조회한다.

```java
package lang.clazz;
public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
      //Class helloClass = Hello.class;
      Class helloClass = Class.forName("lang.clazz.Hello");
      Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
      String result = hello.hello();
      System.out.println("result = " + result);
    } 
}
```

**실행 결과** 
```
 result = hello!
```
- **getDeclaredConstructor().newInstance()** 
- `getDeclaredConstructor()` : 생성자를 선택한다. 
- `newInstance()` : 선택된 생성자를 기반으로 인스턴스를 생성한다.


**리플렉션 - reflection**  
`Class` 를 사용하면 클래스의 메타 정보를 기반으로 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 작업을 할 수 있다.   
이런 작업을 리플렉션이라 한다. 

추가로 애노테이션 정보를 읽어서 특별한 기능을 수행할 수도 있다. 
