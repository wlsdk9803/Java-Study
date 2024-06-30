package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        //System은 운영체제 시스템과 관련된(+자바에 관련된) 몇 가지 간단한 기능을 제공해 주는 클래스다
        //현재 시간을(밀리초) 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경 변수를 읽는다.
//        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다.
        //자바가 사용하는 시스템의 환경, 시스템의 속성을 읽을 수 있다. (인코딩, 자바 버전 등등..)
        System.out.println("properties = " + System.getProperties());

        System.out.println("Java Version = " + System.getProperty("java.version")); //22

        //배열을 고속으로 복사한다.
        char[] originialArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];

        System.arraycopy(originialArray, 0, copiedArray, 0, originialArray.length);
        //운영체제가 레벨에서 통째로 읽어서 복사 -> 속도가 굉장히 빠르다

        // 배열 출력
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);
    }
}
