package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // public이니까 어디서든 사용 가능
        DefaultClass1 defaultClass1 = new DefaultClass1(); // 같은 패키지 내부니까 사용 가능
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
class DefaultClass1{

}
class DefaultClass2{

}
