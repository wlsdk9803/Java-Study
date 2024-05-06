package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 생성자를 private으로 해서
        // 인스턴스 생성을 막는다.
        // MathArrayUtils a = new MathArrayUtils(); 못하게
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
