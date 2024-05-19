package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        // ClassA => ClassB => ClassC 순서로 실행
        // 초기화는 최상위 부모부터 이루어짐. 왜냐? 자식 생성자의 첫줄에서 부모 생성자를 호출하기 때문에

        System.out.println("==============");
        ClassB classB = new ClassB(100);
    }
}
