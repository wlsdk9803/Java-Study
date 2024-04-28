package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();

        System.out.println("name: " + data.name); //0
        System.out.println("score: " + data.score); //100 (지정된 초기값)
    }
}
