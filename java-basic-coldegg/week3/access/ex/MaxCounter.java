package week3.access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    //1. increment()
    public void increment() {
        if (count < max) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    //2. getCount()
    public void getCount(){
        System.out.println(count);
    }

}
