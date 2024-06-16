package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        // Class helloClass = Class.forName("lang.clazz.Hello"); // 사용자한테 "lang.clazz.Hello" 이런 문자열을 입력받을 수 있음

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        // getDeclaredConstructor(): 생성자 선택, newInstance(): 선택된 생성자를 기반으로 인스턴스 생성
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}
