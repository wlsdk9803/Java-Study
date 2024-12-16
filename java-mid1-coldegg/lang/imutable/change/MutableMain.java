package lang.imutable.change;

public class MutableMain {

    public static void main(String[] args) {
        MutableObj obj = new MutableObj(18);
        obj.add(20);
        //value는 addvalue가 더해진 38로 변경

        System.out.println(obj.getValue());
    }
}
