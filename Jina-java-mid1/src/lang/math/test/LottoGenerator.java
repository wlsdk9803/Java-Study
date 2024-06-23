package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private Random random = new Random();
    private int[] lottoArr = new int[6];

    public int[] generate() {
        int count = 0;
        while(count < 6){
            int ranNum = random.nextInt(45) + 1;
            boolean flag = true;

            for(int i=0; i<6; i++){
                if(lottoArr[i] == ranNum) {
                    flag = false; break;
                }
            }

            if(flag){
                lottoArr[count] = ranNum;
                count++;
            }
        }
        return lottoArr;
    }
}
