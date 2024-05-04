package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils(){
        // 실수로 인스턴스를 생성하지 못하게 막는 용도
    }
    static public int sum(int[] values){
        int sum = 0;
        for(int v : values) sum += v;
        return sum;
    }
    static public double average(int[] values){
        if(values.length > 0) return (double) sum(values) / values.length;
        return 0;
    }
    static public int min(int[] values){
        if(values.length > 0){
            int min = values[0];
            for(int i=1; i<values.length; i++) min = Math.min(min, values[i]);
            return min;
        }
        return 0;
    }
    static public int max(int[] values){
        if(values.length > 0){
            int max = values[0];
            for(int i=1; i<values.length; i++) max = Math.max(max, values[i]);
            return max;
        }
        return 0;
    }
}
