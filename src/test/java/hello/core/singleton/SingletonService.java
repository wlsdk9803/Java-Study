package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    // 생성자는 private으로 막아서 외부에서 new 키워드로 객체 인스턴스가 생성하는 것 방지
    // 이게 제일 중요!!
    private SingletonService() {}

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
