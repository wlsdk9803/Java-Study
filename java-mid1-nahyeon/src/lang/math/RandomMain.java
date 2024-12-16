package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random(1);//seed가 같으면 랜덤의 결과도 같다.
        //seed가 같으면 next 할 때 똑같아진다.
        int randomInt = random.nextInt();//int 랜덤 값 (seed를 가지고 계산한 값을 넘겨서)
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();//0.0d~1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10);//0~9까지 출력
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;//1~10까지 출력
        System.out.println("randomRange2 = " + randomRange2);




    }
}
