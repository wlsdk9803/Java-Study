package week3.src.access.b;

import week3.src.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass pub_inst = new PublicClass();

//        DefaultClass1 def_inst = new DefaultClass1();
        //어디서 불렀냐? a패키지가 아닌 b패키지의 현재 클래스에서 호출했으므로, 패키지가 달라 호출 불가능

    }

}
