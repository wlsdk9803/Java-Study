package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoArr = lottoGenerator.generate();

        System.out.print("로또 번호: ");
        for (int lottoNum : lottoArr) {
            System.out.print(lottoNum + " ");
        }
    }
}
