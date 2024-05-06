package week3.src.access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass pub_inst = new PublicClass();
        DefaultClass1 def_inst = new DefaultClass1(); //어디서 불렀냐? 같은 a 패키지 안에 있는 클래스에서 호출 => 사용 가능함
        DefaultClass2 def2_inst = new DefaultClass2();

    }
}

class DefaultClass1{

}

class DefaultClass2 {

}
