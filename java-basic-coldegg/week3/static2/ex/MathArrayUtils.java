package week3.static2.ex;

public class MathArrayUtils {
    private MathArrayUtils(){
    }

    public static double sum(int[] values) {
        double res = 0;
        for(int i=0;i<values.length;i++){
            res += values[i];
        }
        return res;
    }

    public static double average(int[] values) {
        double sum_res = sum(values);
        double res = (sum_res / values.length);
        return res;
    }

    public static int min(int[] values) {
        int min = values[0];
        for(int i=1;i<values.length;i++){
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for(int i=1;i<values.length;i++){
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

}
